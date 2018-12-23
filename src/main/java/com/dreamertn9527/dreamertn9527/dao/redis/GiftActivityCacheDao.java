package com.dreamertn9527.dreamertn9527.dao.redis;

import com.dreamertn9527.dreamertn9527.domain.mysql.GiftActivityPo;

/**
 * 类描述:
 *
 * @author:tangniannian
 * @date:2018/12/23
 * @修改描述：
 * @modifier ${tags}
 */
public interface GiftActivityCacheDao {

    GiftActivityPo findCacheById(Long id);

    Long save(GiftActivityPo giftActivityPo);

    Long saveOther(GiftActivityPo giftActivityPo);
}
