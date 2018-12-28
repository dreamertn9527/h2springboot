package com.dreamertn9527.dreamertn9527.controller;

import com.alibaba.fastjson.JSON;
import com.dreamertn9527.dreamertn9527.dao.mongodb.PersonDao;
import com.dreamertn9527.dreamertn9527.dao.mysql.giftactivity.GiftActivityDao;
import com.dreamertn9527.dreamertn9527.domain.mongodb.Demo;
import com.dreamertn9527.dreamertn9527.domain.mongodb.PersonPo;
import com.dreamertn9527.framework.sequence.GeneralID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/gift")
public class HelloController {

    @Autowired
    private GiftActivityDao giftActivityDao;

    @Autowired
    private PersonDao personDao;

    @Autowired
    private GeneralID generalID;

    @GetMapping("/{id}")
    public String getById(@PathVariable Long id){
        return JSON.toJSONString(giftActivityDao.findById(id));
    }

    @GetMapping("/save")
    public Long getById() {
        PersonPo personPo = new PersonPo();
        personPo.setName("b");
        personPo.setAddress("shanxi");
        personPo.setAge(19);
        List<Demo> demoList = new ArrayList<>();
        Demo demo = new Demo();
        demo.setName("ssss");
        demo.setOther("other");
        demoList.add(demo);
        personPo.setDemoList(demoList);

        return personDao.save(personPo);
    }

    @GetMapping("/find/{id}")
    public String find(@PathVariable Long id) {
        return JSON.toJSONString(personDao.findById(id));
    }

    @GetMapping("/a")
    public String a(){
        return generalID.get("a")+"";
    }

    @GetMapping("/b")
    public String b(){
        return generalID.get("b")+"";
    }

    @GetMapping("/c")
    public String c(){
        return generalID.get("c")+"";
    }

    @GetMapping("/d")
    public String d(){
        return generalID.get("d")+"";
    }
}
