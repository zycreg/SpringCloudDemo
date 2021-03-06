package com.zyc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class ServiceEurekaClient01Application {

	public static void main(String[] args) {
		SpringApplication.run(ServiceEurekaClient01Application.class, args);
	}
	@Value("${server.port}")
	String port;
	@RequestMapping("/hello")
	public String hello(@RequestParam String name){
		return "Hello, "+ name + " i am from port : " + port;
	}

}
