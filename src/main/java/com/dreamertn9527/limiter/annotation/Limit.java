package com.dreamertn9527.limiter.annotation;

import java.lang.annotation.*;
import java.util.concurrent.TimeUnit;

/**
 * 类描述:
 *
 * @author tangniannian
 * @date 2018/12/14
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface Limit {

    int value() default 0;

    TimeUnit timeUnit();
}
