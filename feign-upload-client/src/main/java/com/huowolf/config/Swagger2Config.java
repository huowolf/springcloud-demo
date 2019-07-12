package com.huowolf.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author huowolf
 * @date 2019/7/12
 * @description
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()
                .apis(RequestHandlerSelectors
                        .basePackage("com.huowolf.controller"))
                .paths(PathSelectors.any()).build();
    }
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("Feign文件上传").description("Feign文件上传")
                .version("1.0").build();
    }
}