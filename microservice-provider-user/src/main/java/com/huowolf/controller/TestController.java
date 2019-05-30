package com.huowolf.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author huowolf
 * @date 2019/5/30
 * @description
 */
@RestController
public class TestController {

    @GetMapping("/hello")
    public String hello(HttpServletRequest request){
        return "Hello,I am from "+request.getServerPort()+"!";
    }
}
