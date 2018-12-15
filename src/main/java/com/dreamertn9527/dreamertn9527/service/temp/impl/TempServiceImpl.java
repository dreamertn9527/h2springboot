package com.dreamertn9527.dreamertn9527.service.temp.impl;

import com.dreamertn9527.dreamertn9527.dao.mysql.temp.TempDao;
import com.dreamertn9527.dreamertn9527.domain.mysql.TempPo;
import com.dreamertn9527.dreamertn9527.service.temp.TempService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TempServiceImpl implements TempService {

    @Autowired
    private TempDao tempDao;

    @Override
    public List<TempPo> find() {
        return tempDao.findAll();
    }
}