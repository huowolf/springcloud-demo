package com.huowolf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class FeignHystrixApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignHystrixApplication.class, args);
	}

}
