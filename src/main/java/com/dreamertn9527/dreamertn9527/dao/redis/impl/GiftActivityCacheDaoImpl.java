package com.dreamertn9527.dreamertn9527.dao.redis.impl;

import com.alibaba.fastjson.JSON;
import com.dreamertn9527.dreamertn9527.dao.mysql.giftactivity.GiftActivityDao;
import com.dreamertn9527.dreamertn9527.dao.redis.GiftActivityCacheDao;
import com.dreamertn9527.dreamertn9527.domain.mysql.GiftActivityPo;
import com.dreamertn9527.framework.util.BeanUtil;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import redis.clients.jedis.JedisPool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * 类描述:
 *
 * @author:tangniannian
 * @date:2018/12/23
 * @修改描述：
 * @modifier ${tags}
 */
@Repository
@Slf4j
public class GiftActivityCacheDaoImpl implements GiftActivityCacheDao {

    private static final String GIFT_PREFIX = "gift_prefix_";

    @Autowired
    private JedisPool jedisPool;

    @Autowired
    private GiftActivityDao giftActivityDao;

    private final static Integer MAX_SIZE = 10;

    private static final String DEFAULT_GIFT = "DEFAULT_GIFT";

    private static final  Long TIME_OUT = 30L;

    private static final Integer REDIS_TIME_OUT = 10 * 60;

    private static final TimeUnit TIME_UNIT = TimeUnit.SECONDS;

    /**
     * 1. guava 不能缓存Null
     * 2. load()时，单线程阻塞
     * 3. 可以设置软应用
     */


    private final LoadingCache<Long, String> cache = CacheBuilder.newBuilder()
            // guava最大值100
            .maximumSize(MAX_SIZE)
            // guava 1分钟过期
            .refreshAfterWrite(TIME_OUT, TIME_UNIT)
            .build(new CacheLoader<Long, String>() {
         // 单线程阻塞load
        @Override
        public String load(Long id) throws Exception {
            String key = GIFT_PREFIX + id;
            // 从缓存获取
            String cache = jedisPool.getResource().get(key);
            if(StringUtils.isEmpty(cache)){
                // 回源数据库
                GiftActivityPo giftActivityPo = giftActivityDao.findById(id);
                if(giftActivityPo != null){
                    cache = JSON.toJSONString(giftActivityPo);
                } else {
                    // 数据库没有设置默认值
                    cache = DEFAULT_GIFT;
                }
                // 设置缓存超时时间
                jedisPool.getResource().setex(key, REDIS_TIME_OUT, cache);
            }


            return cache;
        }
    });


    // 回源数据库
    // 1. 同步回源
    // 2. 异步回源：消息、定时器
    // JVM缓存

    @Override
    public GiftActivityPo findCacheById(Long id) {
        // 一次redis查询2ms, 100 = 2*100=200ms
        // 100个key一次批量查询，5ms
        // keys: [k1, k2, k3]
        // vals: [v1, nil, k3]
        // venderId  + pin
        // pin + venderId
        GiftActivityPo giftActivityPo = null;
        try {
            String str = cache.get(id);
            if(StringUtils.isNotEmpty(str) && !DEFAULT_GIFT.equals(str)){
                giftActivityPo = BeanUtil.toBean(str, GiftActivityPo.class);
            }
        } catch (ExecutionException e) {
            log.error("findCacheById ExecutionException", e);
        }

        return giftActivityPo;
    }

    @Override
    public Long save(GiftActivityPo giftActivityPo) {
        Long id = giftActivityDao.save(giftActivityPo);
        try {
            jedisPool.getResource().set(GIFT_PREFIX + id, JSON.toJSONString(giftActivityPo));
        } catch (Exception e) {
            try {
                giftActivityDao.delete(id);
            } catch (Exception e1) {
                // sendMessage
            }
            throw new RuntimeException("保存失败！");
        }

        return id;
    }

    @Override
    @Transactional
    public Long saveOther(GiftActivityPo giftActivityPo) {
        giftActivityPo.setStatus(1);

        Long id = giftActivityDao.save(giftActivityPo);

        jedisPool.getResource().set(GIFT_PREFIX + id, JSON.toJSONString(giftActivityPo));

        // update
        giftActivityPo.setStatus(2);

        return id;
    }
}
