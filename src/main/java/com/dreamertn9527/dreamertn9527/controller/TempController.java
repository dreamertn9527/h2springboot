package com.dreamertn9527.dreamertn9527.controller;

import com.alibaba.fastjson.JSON;
import com.dreamertn9527.dreamertn9527.domain.mysql.TempPo;
import com.dreamertn9527.dreamertn9527.service.temp.TempService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

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

    @GetMapping("/find")
    public String findAll(){
        Map<String, String> idMap = new TreeMap<>();
        Map<String, String> keyMap = new HashMap<>();
        List<TempPo> list = tempService.find();
        for(TempPo tempPo : list){
            idMap.put(tempPo.getId()+"_"+tempPo.getKey(), tempPo.getId().toString());
            keyMap.put(tempPo.getKey(), tempPo.getVal());
        }

        int i = 0;
        String id = "";
        String key = "";
        String value = "";
        String tempId = "";
        Map<String, String> tempMap = new HashMap<>();
        Map<String, Map<String,String>> map = new HashMap<>();
        for(Map.Entry<String, String> entry : idMap.entrySet()){
            String idKey = entry.getKey();
            key = idKey.split("_")[1];
            value = keyMap.get(key);
            if(i == 0){
                id = idKey.split("_")[0];
                tempMap.put(key, value);
                i++;
                continue;
            }

            tempId = entry.getValue();
            if(id.equals(tempId)){
                tempMap.put(key, value);
            } else {
                map.put(id, tempMap);
                tempMap = new HashMap<>();
                tempMap.put(key, value);
            }
            id = idKey.split("_")[0];
            i++;

        }

        if (id.equals(tempId)) {
            tempMap.put(key, value);
            map.put(id, tempMap);
        } else {
            map.put(id, tempMap);
        }

        log.error("map size {}, map val {}", map.size(), JSON.toJSONString(map));

        log.error("list size {}", list.size());

        return JSON.toJSONString(list);
    }
}
