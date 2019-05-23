package com.dreamertn9527.limiter.listener;

import com.dreamertn9527.limiter.utils.CacheUtils;
import com.dreamertn9527.limiter.utils.Constants;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import sun.misc.Cache;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


@Slf4j
@Configuration
@EnableScheduling
public class AppInfoListener{

    @Autowired
    private JedisPool jedisPool;

    private static final Long EXPIRE_TIME = 5*1000L;

    @Scheduled(cron = "0/5 * * * * ?")
    public void init(){
        Jedis jedis = jedisPool.getResource();
        Map<String, String> map = jedis.hgetAll(Constants.LIMITER_IP_ADR);
        log.error("map {}", map);

        List<String> delList = new ArrayList<>();
        for(Map.Entry<String, String> entry : map.entrySet()){
            String key = entry.getKey();
            String value = entry.getValue();
            Long beforeTime = Long.parseLong(value);
            if(beforeTime + EXPIRE_TIME < System.currentTimeMillis()){
                delList.add(key);
                map.remove(key);
            }
        }
        // 删除掉旧的
        if(CollectionUtils.isNotEmpty(delList)){
            for(String key : delList){
                jedis.hdel(Constants.LIMITER_IP_ADR, key);
                map.remove(key);
            }
            refresh(jedis);
        }
        // 如果有新的增加，更新appName
        if(CacheUtils.atomicInteger.get() != map.size()){
            refresh(jedis);
        }
    }

    private void refresh(Jedis jedis){
        Long appNum = jedis.hlen(Constants.LIMITER_IP_ADR);
        CacheUtils.atomicInteger.set(appNum.intValue());
        CacheUtils.limiterMap = new ConcurrentHashMap<>();
        log.error("atomicInteger {}", CacheUtils.atomicInteger.get());
    }




}
