package com.dreamertn9527.dreamertn9527.controller;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import org.springframework.beans.factory.annotation.Value;

import java.util.concurrent.TimeUnit;

/**
 * 类描述:
 *
 * @author:tangniannian
 * @date:2019/1/25
 * @修改描述：
 * @modifier ${tags}
 */
public class Main {

    private static Long time = 30 * 60L;

    public static Cache<String, String> USER_CACHE = CacheBuilder.newBuilder().expireAfterAccess(time, TimeUnit.SECONDS).build();

    public static void main(String[] args) {

    }
}
