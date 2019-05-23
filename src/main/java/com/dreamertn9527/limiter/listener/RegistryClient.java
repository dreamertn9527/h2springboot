package com.dreamertn9527.limiter.listener;

import com.dreamertn9527.limiter.utils.CacheUtils;
import com.dreamertn9527.limiter.utils.Constants;
import com.dreamertn9527.limiter.utils.NetUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;


@Component
@Slf4j
public class RegistryClient {

    @Autowired
    private JedisPool jedisPool;

    @Scheduled(cron = "0/1 * * * * ?")
    public void registry(){
        Jedis jedis = jedisPool.getResource();
        String ip = NetUtils.getLocalHost();
        String value = String.valueOf(System.currentTimeMillis());
        jedis.hset(Constants.LIMITER_IP_ADR, ip, value);
    }
}
