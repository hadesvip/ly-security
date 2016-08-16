package com.tc.ly.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * 配置
 * tips:javaconfig两种方式取配置文件参数
 * 1. Environment environment;
 * 2. @Value(${})
 * example:
 *
 * @Autowired Environment environment;
 * -------------------------
 * @Value("${mysql.jdbc.url}") private String jdbcUrl;
 * Created by wangyong on 2016/8/16.
 */
@Configuration
@PropertySource({"classpath:api.properties"})
public class PropertiesConfig {

    /**
     * to resolve ${} in @value
     * tips:必须是static，优先注册到ioc容器中
     *
     * @return
     */
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

}
