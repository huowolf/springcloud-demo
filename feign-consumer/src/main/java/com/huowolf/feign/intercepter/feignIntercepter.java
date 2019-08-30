package com.huowolf.feign.intercepter;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.stereotype.Component;

/**
 * @创建人：王小伟
 * @创建时间： 2019/8/30
 * @描述：feign 拦截器，可获取请求参数以及统一添加header
 */
@Component
public class feignIntercepter implements RequestInterceptor{
    @Override
    public void apply(RequestTemplate template) {

        //获取请求params 即?xx=xx&xx=xx
        System.out.println("queries:"+template.queries());

        //获取请求体(body)中的参数
        System.out.println("request.body:"+new String(template.request().body()));

        template.header("token","abc");
    }
}
