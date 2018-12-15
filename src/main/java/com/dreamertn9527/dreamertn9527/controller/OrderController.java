package com.dreamertn9527.dreamertn9527.controller;

import com.dreamertn9527.dreamertn9527.service.advdemo.AdvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.Set;

/**
 * 类描述:
 *
 * @author tangniannian
 * @date 2018/12/10
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private AdvService advService;

    @GetMapping("/check/{orderId}/{day}")
    public Boolean checkOrder(@PathVariable Long orderId, @PathVariable String day){
        Set<String> set = new HashSet<>();
        set.add(day);
        return advService.checkIsOrder(orderId, set);
    }

    @GetMapping("/add/{orderId}/{day}")
    public Boolean addOrder(@PathVariable Long orderId, @PathVariable String day){
        return advService.addOrder(orderId, day);
    }
}
