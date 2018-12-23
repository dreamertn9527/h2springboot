package com.dreamertn9527.dreamertn9527.dao.mysql.giftactivity;

import com.dreamertn9527.dreamertn9527.domain.mysql.GiftActivityPo;

/**
 * 类描述:
 *
 * @author tangniannian
 * @date 2018/12/10
 */
public interface GiftActivityDao {

    GiftActivityPo findById(Long id);

    Long save(GiftActivityPo giftActivityPo);
}
