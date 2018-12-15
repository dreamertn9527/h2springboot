package com.dreamertn9527.dreamertn9527.service.advdemo;

import java.util.Set;

/**
 * 类描述:
 *
 * @author tangniannian
 * @date 2018/12/10
 */
public interface AdvService {

    /**
     * 校验订单是否已经被订购
     * @param orderId 订单Id
     * @return true 已经订购
     */
    Boolean checkIsOrder(Long orderId, Set<String> addDaySet);

    /**
     * 添加某一天的订单
     * @param orderId
     * @param day
     * @return
     */
    Boolean addOrder(Long orderId, String day);

    /**
     * 添加几天的订单
     * @param orderId
     * @param set
     * @return
     */
    Boolean batchAddOrder(Long orderId, Set<String> set);

    String find(String key);

    String add(String k, String v);
}
