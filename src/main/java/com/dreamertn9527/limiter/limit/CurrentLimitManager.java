package com.dreamertn9527.limiter.limit;

import com.dreamertn9527.limiter.utils.CacheUtils;
import com.google.common.util.concurrent.RateLimiter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import static com.dreamertn9527.limiter.utils.CacheUtils.limiterMap;

/**
 * 类描述:
 *
 * @author tangniannian
 * @date 2018/12/14
 */
@Component
@Slf4j
public class CurrentLimitManager {


    public RateLimiter getLimiter(String key, int limit, TimeUnit timeUnit){
        return limiterMap.computeIfAbsent(key, new Function<String, RateLimiter>() {
            @Override
            public RateLimiter apply(String s) {
                int appNum = CacheUtils.atomicInteger.get();
                log.error("appNum {}", appNum);
                int current = limit/appNum;
                log.error("current {}", current);
                double perSec = timeUnit.convert(current, TimeUnit.SECONDS);
                log.error("perSec {}", perSec);
                return RateLimiter.create(perSec);
            }
        });
    }


}
