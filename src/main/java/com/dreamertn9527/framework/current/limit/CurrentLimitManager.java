package com.dreamertn9527.framework.current.limit;

import com.google.common.util.concurrent.RateLimiter;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 类描述:
 *
 * @author tangniannian
 * @date 2018/12/14
 */
@Component
public class CurrentLimitManager {

    private static Map<String, RateLimiter> limiterMap = new ConcurrentHashMap<>();

    public RateLimiter getLimiter(String key, long limit){
        return limiterMap.computeIfAbsent(key, s -> RateLimiter.create(limit));
    }
}
