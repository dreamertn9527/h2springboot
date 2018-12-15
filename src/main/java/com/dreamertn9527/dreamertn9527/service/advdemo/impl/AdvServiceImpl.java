package com.dreamertn9527.dreamertn9527.service.advdemo.impl;

import com.dreamertn9527.dreamertn9527.service.advdemo.AdvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;

import java.util.Set;

/**
 * 类描述: 校验订单是否已经订购
 *
 * @author tangniannian
 * @date 2018/12/10
 */
@Service
public class AdvServiceImpl implements AdvService {

    @Autowired
    private Jedis jedis;

    private final static String ORDER_PREFIX = "order_perfix_";

    @Override
    public Boolean checkIsOrder(Long orderId, Set<String> addDaySet) {
        Set<String> set = jedis.smembers(ORDER_PREFIX + orderId);
        return set != null && set.containsAll(addDaySet);
    }

    @Override
    public Boolean addOrder(Long orderId, String day){
        return jedis.sadd(ORDER_PREFIX + orderId, day) == 1;
    }

    @Override
    public Boolean batchAddOrder(Long orderId, Set<String> set){
        return jedis.sadd(ORDER_PREFIX + orderId, set.toArray(new String[0])) == 1;
    }
}
