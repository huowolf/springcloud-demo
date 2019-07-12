package com.huowolf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author huowolf
 * @date 2019/7/12
 * @description
 */
@EnableFeignClients
@SpringBootApplication
public class FeignUploadClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignUploadClientApplication.class,args);
    }
}
