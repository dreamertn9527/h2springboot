package com.dreamertn9527.framework.aspect.pointcut;

import org.aspectj.lang.annotation.Pointcut;

/**
 * 类描述: 系统切点
 *
 * @author:tangniannian
 * @date:2017/3/12
 * @修改描述：
 * @modifier ${tags}
 */
public class SystemArchitecture {

    @Pointcut("execution(* *(..))")
    public void anyMethod() {

    }

    @Pointcut("execution(public * *(..))")
    public void anyPublicMethod() {

    }

    @Pointcut("execution(* com.dreamertn9527..*.service..*(..))")
    public void globalServiceLayer() {

    }

    @Pointcut("execution(* com.dreamertn9527..*.controller..*(..))")
    public void globalControllerLayer() {

    }

}
