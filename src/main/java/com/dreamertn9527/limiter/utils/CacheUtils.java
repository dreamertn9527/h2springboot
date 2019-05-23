package com.dreamertn9527.limiter.utils;

import com.google.common.util.concurrent.RateLimiter;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 类描述:
 *
 * @author:tangniannian
 * @date:2019/5/21
 * @修改描述：
 * @modifier ${tags}
 */
public class CacheUtils {

    public static Map<String, RateLimiter> limiterMap = new ConcurrentHashMap<>();

    public static AtomicInteger atomicInteger = new AtomicInteger(1);
}
