package com.example.springboot.controller;


import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfig;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HelloController {

    @ApolloConfig
    private Config config;

    @GetMapping("/hello")
    public String hello() {
        System.out.println("线程池名称: " + Thread.currentThread().getName());
        return config.getProperty("name", "default");
    }
}
