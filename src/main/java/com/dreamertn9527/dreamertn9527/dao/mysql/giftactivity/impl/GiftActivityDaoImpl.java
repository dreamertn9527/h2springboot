package com.dreamertn9527.dreamertn9527.dao.mysql.giftactivity.impl;

import com.dreamertn9527.dreamertn9527.dao.mysql.giftactivity.GiftActivityDao;
import com.dreamertn9527.dreamertn9527.domain.mysql.GiftActivityPo;
import com.dreamertn9527.dreamertn9527.repository.mysql.GiftActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * 类描述:
 *
 * @author tangniannian
 * @date 2018/12/10
 */
@Repository
public class GiftActivityDaoImpl implements GiftActivityDao {

    @Autowired
    private GiftActivityRepository giftActivityRepository;

    @Override
    public GiftActivityPo findById(Long id) {
        return giftActivityRepository.findById(id);
    }
}
