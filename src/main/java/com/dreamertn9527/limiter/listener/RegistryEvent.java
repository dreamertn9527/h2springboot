package com.dreamertn9527.limiter.listener;


import com.dreamertn9527.limiter.utils.CacheUtils;
import com.dreamertn9527.limiter.utils.NetUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import static com.dreamertn9527.limiter.utils.Constants.LIMITER_IP_ADR;

@Component
@Slf4j
public class RegistryEvent implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private JedisPool jedisPool;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        Jedis jedis = jedisPool.getResource();
        String ip = NetUtils.getLocalHost();
        String id = contextRefreshedEvent.getApplicationContext().getId();
        String uniqueKey = ip + "_" + id;
        String key = LIMITER_IP_ADR + id;
        jedis.hset(key, uniqueKey, ip);
    }
}
