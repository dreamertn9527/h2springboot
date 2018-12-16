package com.dreamertn9527.framework.annotation;

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

    int value() default 0;

    Model limitModel();

    enum Model{
        EVERY_SECOND
    }
}
