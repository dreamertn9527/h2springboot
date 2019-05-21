package com.dreamertn9527.limiter.aspects;

import com.dreamertn9527.limiter.annotation.Limit;
import com.dreamertn9527.limiter.limit.CurrentLimitManager;
import com.google.common.util.concurrent.RateLimiter;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

/**
 * 类描述: 限流
 *
 * @author:tangniannian
 * @date:2018/12/15
 * @修改描述：
 * @modifier ${tags}
 */
@Aspect
@Configuration
@Slf4j
public class LimitAspect {

    @Autowired
    private CurrentLimitManager currentLimitManager;

    @Pointcut("@annotation(com.dreamertn9527.limiter.annotation.Limit)")
    private void pointCut(){

    }

    @Around(value = "pointCut()")
    public Object handleAround(ProceedingJoinPoint joinPoint) throws Throwable {
        MethodSignature joinPointObject = (MethodSignature) joinPoint.getSignature();
        Method method = joinPointObject.getMethod();
        Object retVal = null;
        if(method.isAnnotationPresent(Limit.class)){
            Annotation annotation = method.getAnnotation(Limit.class);
            String key = joinPoint.getTarget().getClass().getName() + "#" + method.getName();
            TimeUnit timeUnit = ((Limit) annotation).timeUnit();
            RateLimiter rateLimiter = currentLimitManager.getLimiter(key, ((Limit) annotation).value(), timeUnit);
            if(rateLimiter.tryAcquire()){
                retVal = joinPoint.proceed(joinPoint.getArgs());
            }
        } else {
            retVal = joinPoint.proceed(joinPoint.getArgs());
        }

        return retVal;
    }
}
