package com.tc.ly.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * Created by wangyong on 2016/8/12.
 */
@Configuration
@ComponentScan(basePackages = {"com.tc.ly.dao", "com.tc.ly.mapper", "com.tc.ly.config", "com.tc.ly.component"}, useDefaultFilters = false, includeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION, value = {Service.class, Repository.class, Component.class})
})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ApiConfig {

}
