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

    private static final Map<String, RateLimiter> limiterMap = new ConcurrentHashMap<>();

    public RateLimiter getLimiter(String key, long limit){
//        limiterMap.computeIfAbsent(new RateLimiter(limit))

        return null;
    }
}
