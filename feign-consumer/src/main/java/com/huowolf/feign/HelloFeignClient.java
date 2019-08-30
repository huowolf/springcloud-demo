package com.huowolf.feign;

import com.huowolf.config.FeignLogConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "feign-provider",configuration = FeignLogConfig.class)
public interface HelloFeignClient {

    @GetMapping("/hello")
    String hello(@RequestParam("name") String name);
}
