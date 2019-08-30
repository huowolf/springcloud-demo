package com.huowolf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableHystrix
@SpringBootApplication
public class HystrixDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HystrixDemoApplication.class, args);
	}

    @Bean
    @LoadBalanced   //指定该注解以后restTemplate就具备根据服务名去调用到相关服务的能力
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
