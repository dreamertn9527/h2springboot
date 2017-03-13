package com.dreamertn9527.framework.aspect.annotation;

import java.lang.annotation.*;

/**
 * 类描述:分页注解，用于后端分页
 *
 * @author:tangniannian
 * @date:2017/3/12
 * @修改描述：
 * @modifier ${tags}
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface PaginationController {

    // 前端默认为bootStrap
    String webTableType() default "bootStrap";
}
