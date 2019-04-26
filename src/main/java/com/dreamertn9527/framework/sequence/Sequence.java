package com.dreamertn9527.framework.sequence;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;


public class Sequence {

    private int blockSize = 5;

    private long startValue = 0;

    private DataSource dataSource;

    private final static String GET_SQL = "select id from sequence_table where name=?";

    private final static String NEW_SQL = "insert into sequence_table (id,name) values(?,?)";

    private final static String UPDATE_SQL = "update sequence_table set id=? where name=? and id=?";

    public void setBlockSize(int blockSize) {
        this.blockSize = blockSize;
    }

    public void setStartValue(long startValue) {
        this.startValue = startValue;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * 步长map
     */
    private Map<String, Step> sepMap = new HashMap<>();

    public synchronized long get(String sequenceName) {
        Step step = sepMap.get(sequenceName);
        if (step == null) {
            step = new Step(startValue, startValue + blockSize);
            sepMap.put(sequenceName, step);
        } else {
            if (step.currentValue < step.endValue) {
                return step.incrementAndGet();
            }
        }
        for (int i = 0; i < blockSize; i++) {
            if (getNextBlock(sequenceName, step)) {
                return step.incrementAndGet();
            }
        }
        throw new RuntimeException("error...");
    }

    private boolean getNextBlock(String sequenceName, Step step) {
        Long value = getPersistenceValue(sequenceName);
        if (value == null) {
            try {
                value = newPersistenceValue(sequenceName);
            } catch (Exception e) {
                value = getPersistenceValue(sequenceName);
            }
        }
        boolean b = saveValue(value, sequenceName) == 1;
        if (b) {
            step.setCurrentValue(value);
            step.setEndValue(value + blockSize);
        }
        return b;
    }

    static class Step {
        private long currentValue;
        private long endValue;

        public Step(long currentValue, long endValue) {
            this.currentValue = currentValue;
            this.endValue = endValue;
        }

        public void setCurrentValue(long currentValue) {
            this.currentValue = currentValue;
        }

        public void setEndValue(long endValue) {
            this.endValue = endValue;
        }

        /**
         * 递增获取得到当前的数值
         *
         * @return
         */
        public long incrementAndGet() {
            return ++currentValue;
        }
    }

    private int saveValue(long value, String sequenceName) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = dataSource.getConnection();
            statement = connection.prepareStatement(UPDATE_SQL);
            statement.setLong(1, value + blockSize);
            statement.setString(2, sequenceName);
            statement.setLong(3, value);
            return statement.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException("newPersistenceValue error!", e);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {

                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {

                }
            }
        }
    }

    private Long getPersistenceValue(String sequenceName) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            connection = dataSource.getConnection();
            statement = connection.prepareStatement(GET_SQL);
            statement.setString(1, sequenceName);
            resultSet = statement.executeQuery();
            //数据库自增的主键返回
            if (resultSet.next()) {
                return resultSet.getLong("id");
            }
        } catch (Exception e) {
            throw new RuntimeException("getPersistenceValue error!", e);
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {

                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                }
            }
        }
        return null;
    }

    //创建持久化值，id的初始化值为0
    private Long newPersistenceValue(String sequenceName) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = dataSource.getConnection();
            statement = connection.prepareStatement(NEW_SQL);
            statement.setLong(1, startValue);
            statement.setString(2, sequenceName);
            statement.executeUpdate();
        } catch (Exception e) {
            //log.error("newPersistenceValue error!", e);
            throw new RuntimeException("newPersistenceValue error!", e);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    // log.error("close statement error!", e);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    // log.error("close connection error!", e);
                }
            }
        }
        return startValue;
    }



}
