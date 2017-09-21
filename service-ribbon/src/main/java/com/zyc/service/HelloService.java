package com.zyc.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by zhangyuancheng on 2017/9/19.
 */
@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "getError")
    public String hiService(String name) {
        return restTemplate.getForObject("http://EUREKA-CLIENT-01/hello?name="+name,String.class);
    }

    public String getError(String name){
        return "hi, "+ name +" sorry error!!!";
    }
}
