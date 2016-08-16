package com.tc.ly.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * 数据源配置
 * Created by wangyong on 2016/8/16.
 */
@Configuration
@PropertySource("classpath:api.properties")
public class DataSourceConfig {

    @Value("${mysql.jdbc.url}")
    private String jdbcUrl;

    @Value("${mysql.jdbc.driverClass}")
    private String driverClass;

    @Value("${mysql.username}")
    private String userName;

    @Value("${mysql.password}")
    private String password;

    @Value("${mysql.jdbc.maxActive}")
    private int maxActive;

    @Value("${mysql.jdbc.initialSize}")
    private int initialSize;

    @Value("${mysql.maxWait}")
    private long maxWait;

    @Value("${mysql.minIdle}")
    private int minIdle;

    @Value("${mysql.timeBetweenEvictionRunsMillis}")
    private long timeBetweenEvictionRunsMillis;

    @Value("${mysql.minEvictableIdleTimeMillis}")
    private long minEvictableIdleTimeMillis;

    @Value("${mysql.validationQuery}")
    private String validationQuery;

    @Value("${mysql.testWhileIdle}")
    private boolean testWhileIdle;

    @Value("${mysql.testOnBorrow}")
    private boolean testOnBorrow;

    @Value("${mysql.testOnReturn}")
    private boolean testOnReturn;

    @Value("${mysql.jdbc.filters}")
    private String filters;


    @Bean
    public DataSource dataSource() throws SQLException {
        DruidDataSource dataSource = new DruidDataSource();

        dataSource.setUsername(userName);
        dataSource.setPassword(password);
        dataSource.setUrl(jdbcUrl);
        dataSource.setDriverClassName(driverClass);
        dataSource.setMaxActive(maxActive);
        dataSource.setInitialSize(initialSize);
        dataSource.setMaxWait(maxWait);
        //dataSource.setMaxIdle(minIdle);
        dataSource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
        dataSource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
        dataSource.setValidationQuery(validationQuery);
        dataSource.setTestWhileIdle(testWhileIdle);
        dataSource.setTestOnBorrow(testOnBorrow);
        dataSource.setTestOnReturn(testOnReturn);
        dataSource.setFilters(filters);

        return dataSource;
    }

}
