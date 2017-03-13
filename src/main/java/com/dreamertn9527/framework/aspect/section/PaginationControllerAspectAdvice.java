package com.dreamertn9527.framework.aspect.section;

import com.dreamertn9527.framework.aspect.annotation.PaginationController;
import com.github.pagehelper.PageHelper;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * 类描述:分页注解切面
 * 作用于controller层
 * 使用该注解，默认一个页面显示10，若有参数，根据传入参数进行分页
 *
 * @author:tangniannian
 * @date:2017/3/12
 * @修改描述：
 * @modifier ${tags}
 */

@Component
@Aspect
public class PaginationControllerAspectAdvice {

    @Around(value = "com.dreamertn9527.framework.aspect.pointcut.SystemArchitecture.globalControllerLayer() && @annotation(paginationController)")
    public Object paginationController(ProceedingJoinPoint jp, PaginationController paginationController) throws Throwable {

        Object[] args = jp.getArgs();
        if(args.length == 0){
            throw new RuntimeException("分页方法的传入参数错误");
        }

        RequestAttributes ra = RequestContextHolder.getRequestAttributes();
        ServletRequestAttributes sra = (ServletRequestAttributes) ra;
        HttpServletRequest request = sra.getRequest();

        for (int i = 0; i < args.length; i++) {
            if (args[i] instanceof HttpServletRequest) {
                request = (HttpServletRequest) args[i];
            }
        }

        if (request == null) {
            throw new RuntimeException("分页方法的传入参数错误");
        }

        String start = request.getParameter("start"); // 起始页
        String length = request.getParameter("length"); // 行数

        if(start == null || start.equals("")){
            start = "0";
        }

        if (length == null || length.equals("")) {
            length = "10";
        }
        // 分页
        PageHelper.startPage(Integer.parseInt(start), Integer.parseInt(length));

        Object o = jp.proceed();

        return o;
    }
}
