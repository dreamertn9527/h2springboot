package com.dreamertn9527.framework.druid;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.SQLException;

/**
 * 类描述:duid配置类
 *
 * @author:tangniannian
 * @date:2017/3/12
 * @修改描述：
 * @modifier ${tags}
 */
@Configuration
@EnableConfigurationProperties(DruidProperties.class)
@ConditionalOnClass(DruidDataSource.class)
@ConditionalOnProperty(prefix = "spring.datasource", name = "url")
@AutoConfigureBefore(DataSourceAutoConfiguration.class)
public class DruidAutoConfiguration {

    @Autowired
    private DruidProperties druidProperties;

    @Bean
    public DruidDataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(druidProperties.getUrl());
        dataSource.setUsername(druidProperties.getUsername());
        dataSource.setPassword(druidProperties.getPassword());
        if (druidProperties.getInitialSize() > 0) {
            dataSource.setInitialSize(druidProperties.getInitialSize());
        }
        if (druidProperties.getMinIdle() > 0) {
            dataSource.setMinIdle(druidProperties.getMinIdle());
        }
        if (druidProperties.getMaxActive() > 0) {
            dataSource.setMaxActive(druidProperties.getMaxActive());
        }
        dataSource.setTestOnBorrow(druidProperties.isTestOnBorrow());
        try {
            dataSource.init();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return dataSource;
    }
}
