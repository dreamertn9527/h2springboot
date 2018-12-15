package com.dreamertn9527.dreamertn9527.dao.mysql.temp.impl;

import com.dreamertn9527.dreamertn9527.dao.mysql.temp.TempDao;
import com.dreamertn9527.dreamertn9527.domain.mysql.TempPo;
import com.dreamertn9527.dreamertn9527.repository.mysql.TempRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 类描述:
 *
 * @author tangniannian
 * @date 2018/12/11
 */
@Repository
public class TempDaoImpl implements TempDao {

    @Autowired
    private TempRepository repository;

    @Override
    public List<TempPo> findAll() {
        return repository.findAll();
    }
}
