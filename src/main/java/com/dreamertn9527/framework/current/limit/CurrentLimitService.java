package com.dreamertn9527.framework.current.limit;

import com.alibaba.fastjson.JSON;
import com.dreamertn9527.framework.annotation.Limit;
import com.dreamertn9527.framework.annotation.LimitService;
import com.google.common.util.concurrent.RateLimiter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.stereotype.Component;
import org.springframework.util.ReflectionUtils;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Map;

/**
 * 类描述:
 *
 * @author tangniannian
 * @date 2018/12/14
 */
@Component
@Slf4j
public class CurrentLimitService implements BeanPostProcessor {

    @Autowired
    private CurrentLimitManager currentLimitManager;


    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String beanName) throws BeansException {
        Method[] methods = ReflectionUtils.getAllDeclaredMethods(o.getClass());
        for(Method method : methods){
            Annotation annotation = AnnotationUtils.findAnnotation(method, Limit.class);
            if(annotation != null){
                String className = o.getClass().getName().split("[$]")[0];
                String key = className + "#" + method.getName() + "-"+method.getParameterCount();
                Limit.Model model = ((Limit) annotation).limitUnit();
                Long val = ((Limit) annotation).value();
                if(model.equals(Limit.Model.EVERY_MINUTE)){
                    val = val / 60;
                }
                log.error("key {} val {}", key, val);
                currentLimitManager.getLimiter(key, val);
            }
        }

        return o;
    }
}
