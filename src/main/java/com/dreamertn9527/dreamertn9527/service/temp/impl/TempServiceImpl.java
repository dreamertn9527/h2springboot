package com.dreamertn9527.dreamertn9527.service.temp.impl;

import com.dreamertn9527.dreamertn9527.dao.mysql.temp.TempDao;
import com.dreamertn9527.dreamertn9527.domain.mysql.TempPo;
import com.dreamertn9527.dreamertn9527.service.temp.TempService;
import com.dreamertn9527.framework.annotation.Limit;
import com.dreamertn9527.framework.annotation.LimitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@LimitService
public class TempServiceImpl implements TempService {

    @Autowired
    private TempDao tempDao;

    @Override
    @Limit(limitUnit = Limit.Model.EVERY_MINUTE, value = 600)
    public List<TempPo> find() {
        return tempDao.findAll();
    }

    @Override
    @Limit(limitUnit = Limit.Model.EVERY_SECOND, value = 100)
    public TempPo findById(Long id) {
        return tempDao.findById(id);
    }


}