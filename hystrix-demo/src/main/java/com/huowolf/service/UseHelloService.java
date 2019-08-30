package com.huowolf.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @创建人：王小伟
 * @创建时间： 2019/8/30
 * @描述：调用feign-provider中的hello 服务
 */
@Service
public class UseHelloService {

    @Autowired
    private RestTemplate restTemplate;

    //指定服务回退时调用的方法
    @HystrixCommand(fallbackMethod = "useHelloFallback")
    public String useHello(){
        return restTemplate.getForObject("http://feign-provider/hello?name={1}", String.class, "zhangsan");
    }

    public String useHelloFallback(){
        return "system error";
    }
}
