package com.huowolf.controller;

import com.huowolf.feign.HelloFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 使用OpenFeign测试微服务
 */
@RestController
public class HelloController {

    @Autowired
    private HelloFeignClient helloFeignClient;

    @GetMapping("/hello")
    public String sayHello(String name){
        return helloFeignClient.hello(name);
    }
}
