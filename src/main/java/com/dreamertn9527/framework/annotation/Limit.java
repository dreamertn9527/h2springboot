package com.dreamertn9527.framework.annotation;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

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

    long value();

    Model limitUnit();

    enum Model{
        EVERY_MINUTE,
        EVERY_SECOND
    }
}
