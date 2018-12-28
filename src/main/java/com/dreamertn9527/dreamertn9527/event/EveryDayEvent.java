package com.dreamertn9527.dreamertn9527.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
@Slf4j
public class EveryDayEvent implements ApplicationListener<ContextRefreshedEvent> {

    Map<String, String> map = new ConcurrentHashMap<>();

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        map.put("1", "1");
        log.info("map init {}", map);
    }


}
