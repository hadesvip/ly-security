package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wangyong on 2016/8/12.
 */
@RestController
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "hello,springBoot...";
    }


    @RequestMapping("/user")
    public String user() {

        return "hello,admin...";
    }
}
