package com.zyc.controller;

import com.netflix.discovery.converters.Auto;
import com.zyc.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhangyuancheng on 2017/9/20.
 */
@RestController
public class HelloController {
    @Autowired
    HelloService helloService;
    @RequestMapping(value = "/hello")
    public String hello(@RequestParam String name){
        return helloService.hello(name);
    }
}
