package com.dreamertn9527.dreamertn9527.controller;

import com.alibaba.fastjson.JSON;
import com.dreamertn9527.dreamertn9527.domain.mysql.TempPo;
import com.dreamertn9527.dreamertn9527.service.advdemo.AdvService;
import com.dreamertn9527.dreamertn9527.service.temp.TempService;
import com.dreamertn9527.limiter.annotation.Limit;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

/**
 * 类描述:
 *
 * @author tangniannian
 * @date 2018/12/11
 */
@RestController
@RequestMapping("/temp")
@Slf4j
public class TempController {

    @Autowired
    private TempService tempService;

    @Autowired
    private AdvService advService;

    @GetMapping("/find/{id}")
    public String findById(@PathVariable Long id){
        TempPo tempPo = tempService.findById(id);
        return JSON.toJSONString(tempPo)+8081;
    }

    @GetMapping("/findAll")
    public String findAll(){
        List<TempPo> tempPos = tempService.find();
        return JSON.toJSONString(tempPos);
    }

    @GetMapping("/add/{key}/{val}")
    public Boolean add(@PathVariable String key, @PathVariable String val){
        advService.add(key, val);

        return Boolean.TRUE;
    }

    @GetMapping("/get/{key}")
    public String get(@PathVariable String key){
        return advService.find(key);
    }
}
