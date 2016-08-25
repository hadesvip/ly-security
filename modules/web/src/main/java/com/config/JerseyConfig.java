package com.config;

import com.controller.UserController;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

/**
 * Created by wangyong on 2016/8/25.
 */
@Configuration
public class JerseyConfig extends ResourceConfig {


    public JerseyConfig() {

        register(UserController.class);
    }

}
