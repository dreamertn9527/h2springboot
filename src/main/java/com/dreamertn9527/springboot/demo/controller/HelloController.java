package com.dreamertn9527.springboot.demo.controller;

import com.dreamertn9527.springboot.demo.service.HelloMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    public Map Hello(Map map, @RequestParam(value = "cardId", required = false) String cardId){

        map.put("userList", helloMapper.getListInfo(new HashMap()));
        return map;
    }

    @RequestMapping("/")
    public String index(){
        return "hello";
    }
}
