package com.dreamertn9527.dreamertn9527.event;

import com.alibaba.fastjson.JSON;
import com.dreamertn9527.dreamertn9527.domain.redis.RolePO;
import com.dreamertn9527.dreamertn9527.domain.redis.SystemPO;
import com.dreamertn9527.dreamertn9527.domain.redis.UserPO;
import com.dreamertn9527.framework.util.BeanUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 类描述:
 *
 * @author:tangniannian
 * @date:2018/12/28
 * @修改描述：
 * @modifier ${tags}
 */
@Component
@Slf4j
public class RefreshManEvent implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private JedisPool jedisPool;

    public static final String USER_PREFIX = "user_";

    public static final String SYS_PREFIX = "sys_";

    public static final String ROLE_PREFIX = "role_";


    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        List<RolePO> rolePOList = null;
        List<SystemPO> systemPOList = null;
        List<UserPO> userPOList = null;
        try {
            Resource role = contextRefreshedEvent.getApplicationContext().getResource("classpath:manager/role.json");
            String roleJson = IOUtils.toString(role.getInputStream(), "utf-8");

            Resource sysPo = contextRefreshedEvent.getApplicationContext().getResource("classpath:manager/system.json");
            String sysJson = IOUtils.toString(sysPo.getInputStream(), "utf-8");

            Resource user = contextRefreshedEvent.getApplicationContext().getResource("classpath:manager/user.json");
            String userJson = IOUtils.toString(user.getInputStream(), "utf-8");

            Jedis jedis = jedisPool.getResource();

            rolePOList = BeanUtil.toList(roleJson, RolePO.class);
            for(RolePO rolePO : rolePOList){
                jedis.zadd(ROLE_PREFIX, rolePO.getId(), JSON.toJSONString(rolePO));
            }

            systemPOList = BeanUtil.toList(sysJson, SystemPO.class);
            for(SystemPO systemPO : systemPOList){
                jedis.zadd(SYS_PREFIX, systemPO.getId(), JSON.toJSONString(systemPO));
            }

            userPOList = BeanUtil.toList(userJson, UserPO.class);
            for(UserPO userPO : userPOList){
                jedis.zadd(USER_PREFIX, userPO.getId(), JSON.toJSONString(userPO));
            }

            log.error("user id 1 {}", jedis.zrange(USER_PREFIX, 0, 0));
            log.error("sys id 1 {}", jedis.zrange(SYS_PREFIX, 0, 0));
            log.error("role id 1 {}", jedis.zrange(ROLE_PREFIX, 0, 0));

            log.error("user id 1 {}", jedis.zrangeByScore(USER_PREFIX, 0, 1));
            log.error("sys id 1 {}", jedis.zrangeByScore(SYS_PREFIX, 0, 1));
            log.error("role id 1 {}", jedis.zrangeByScore(ROLE_PREFIX, 0, 1));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
