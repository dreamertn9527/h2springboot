package com.dreamertn9527.limiter.limit;

import com.dreamertn9527.limiter.utils.CacheUtils;
import com.google.common.util.concurrent.RateLimiter;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

/**
 * 类描述:
 *
 * @author tangniannian
 * @date 2018/12/14
 */
@Component
public class CurrentLimitManager {

    private static Map<String, RateLimiter> limiterMap = new ConcurrentHashMap<>();

    public RateLimiter getLimiter(String key, int limit, TimeUnit timeUnit){
        return limiterMap.computeIfAbsent(key, s -> RateLimiter.create(timeUnit.convert((limit/CacheUtils.atomicInteger.get()), TimeUnit.SECONDS)));
    }


}
