package com.dreamertn9527.platform.pagehelper;

import com.github.pagehelper.PageHelper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.Properties;

/**
 * 类描述:分页插件
 *
 * @author:tangniannian
 * @date:2017/3/12
 * @修改描述：
 * @modifier ${tags}
 */
@Configuration
@EnableTransactionManagement
public class PageHelperConfig {

    @Bean(name = "PageHelperConfig")
    public PageHelper pageHelper() {
        //分页插件
        PageHelper pageHelper = new PageHelper();
        Properties props = new Properties();
        props.setProperty("reasonable", "true");
        props.setProperty("supportMethodsArguments", "true");
        props.setProperty("returnPageInfo", "check");
        props.setProperty("params", "count=countSql");
        pageHelper.setProperties(props);

        return pageHelper;
    }
}
