package com.dreamertn9527.demo.controller;

import com.dreamertn9527.demo.service.HelloMapper;
import com.dreamertn9527.framework.aspect.annotation.PaginationController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 类描述:
 *
 * @author:tangniannian
 * @date:2017/3/11
 * @修改描述：
 * @modifier ${tags}
 */
@RestController
public class HelloController {

    @Autowired
    private HelloMapper helloMapper;

    @RequestMapping("/hello")
    @PaginationController
    public Map Hello(Map map){
        map.put("userList", helloMapper.getListInfo(new HashMap()));
        return map;
    }

    @RequestMapping("/")
    public String index(){
        return "hello";
    }


}
