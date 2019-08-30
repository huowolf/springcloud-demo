package com.huowolf.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @创建人：王小伟
 * @创建时间： 2019/8/30
 * @描述：调用feign-provider中的hello 服务
 *
 * 使用 fallback 属性指定降级回退类    fallback = HelloFeignFallback.class
 * 使用 fallbackFactory 获取降级回退的原因
 * 不要同时指定 fallback 和 fallbackFactory
 */
@FeignClient(name = "feign-provider" , fallbackFactory = HelloFeignFallbackFactory.class)
public interface HelloFeign {

    @GetMapping("/hello")
    String useHello(@RequestParam("name") String name);

}
