package com.huowolf.controller;

import com.huowolf.feign.HelloFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @创建人：王小伟
 * @创建时间： 2019/8/30
 * @描述：
 */
@RestController
@RequestMapping("/hystrix")
public class ConsumerController {

    @Autowired
    private HelloFeign helloFeign;

    @GetMapping("/hello")
    public String hello(){
        return helloFeign.useHello("test");
    }

}
