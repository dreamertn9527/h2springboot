package com.dreamertn9527.framework.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author:tangniannian
 * @date:2019/4/16
 */
@AllArgsConstructor
@Getter
public enum SequenceEnum {

    DEMO("a", "测试");

    private String key;

    private String desc;

    static Map<String, SequenceEnum> Map = new HashMap<>();

    static {
        for(SequenceEnum sequenceEnum : SequenceEnum.values()){
            Map.put(sequenceEnum.getKey(), sequenceEnum);
        }
    }

    public static SequenceEnum forName(String key){
        return Map.get(key);
    }

}
