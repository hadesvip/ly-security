package com.controller;

import com.tc.ly.bean.User;
import org.springframework.stereotype.Controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * 用户相关
 * Created by wangyong on 2016/8/25.
 */
@Controller
@Path("/user")
public class UserController {

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public User user(@PathParam("id") int id) {
        System.out.println("id:" + id);
        User user = new User();
        user.setUserName("admin" + id);
        user.setPassword("admin");
        return user;
    }
}
