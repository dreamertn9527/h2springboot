package com.dreamertn9527.framework.annotation;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * 类描述:
 *
 * @author:tangniannian
 * @date:2018/12/15
 * @修改描述：
 * @modifier ${tags}
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface LimitService {

    String value() default "";
}
