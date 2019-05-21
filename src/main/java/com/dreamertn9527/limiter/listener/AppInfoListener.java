package com.dreamertn9527.limiter.listener;


import com.dreamertn9527.limiter.utils.CacheUtils;
import com.dreamertn9527.limiter.utils.Constants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;


@Slf4j
@Configuration
@EnableScheduling
public class AppInfoListener{

    @Autowired
    private JedisPool jedisPool;

    @Scheduled(cron = "0/2 * * * * ?")
    public void init(){
        Jedis jedis = jedisPool.getResource();
        Long appNums = jedis.hlen(Constants.LIMITER_IP_ADR);
        log.error("AppInfoListener appNums {}", appNums);
        CacheUtils.atomicInteger.set(appNums.intValue());
    }




}
