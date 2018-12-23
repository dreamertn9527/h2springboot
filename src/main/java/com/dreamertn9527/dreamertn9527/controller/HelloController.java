package com.dreamertn9527.dreamertn9527.controller;

import com.alibaba.fastjson.JSON;
import com.dreamertn9527.dreamertn9527.dao.mongodb.PersonDao;
import com.dreamertn9527.dreamertn9527.dao.mysql.giftactivity.GiftActivityDao;
import com.dreamertn9527.dreamertn9527.domain.mongodb.PersonPo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gift")
public class HelloController {

    @Autowired
    private GiftActivityDao giftActivityDao;

    @Autowired
    private PersonDao personDao;

    @GetMapping("/{id}")
    public String getById(@PathVariable Long id){
        return JSON.toJSONString(giftActivityDao.findById(id));
    }

    @GetMapping("/save")
    public Long getById() {
        PersonPo personPo = new PersonPo();
        personPo.setName("a");
        personPo.setAddress("beijing");
        personPo.setAge(18);
        return personDao.save(personPo);
    }

    @GetMapping("/find/{id}")
    public String find(@PathVariable Long id) {
        return JSON.toJSONString(personDao.findById(id));
    }

}
