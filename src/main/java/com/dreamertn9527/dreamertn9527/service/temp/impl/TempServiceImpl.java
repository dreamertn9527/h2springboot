package com.dreamertn9527.dreamertn9527.service.temp.impl;

import com.dreamertn9527.dreamertn9527.dao.mysql.temp.TempDao;
import com.dreamertn9527.dreamertn9527.domain.mysql.TempPo;
import com.dreamertn9527.dreamertn9527.service.temp.TempService;
import com.dreamertn9527.framework.annotation.Limit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TempServiceImpl implements TempService {

    @Autowired
    private TempDao tempDao;

    @Override
    @Limit(value = 120, limitModel = Limit.Model.EVERY_SECOND)
    public List<TempPo> find() {
        return tempDao.findAll();
    }

    @Override
    @Limit(value = 130, limitModel = Limit.Model.EVERY_SECOND)
    public TempPo findById(Long id) {
        return tempDao.findById(id);
    }


}