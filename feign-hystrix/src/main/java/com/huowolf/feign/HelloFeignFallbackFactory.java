package com.huowolf.feign;

import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @创建人：王小伟
 * @创建时间： 2019/8/30
 * @描述：通过实现 FallbackFactory 来检查回退原因
 */
@Slf4j
@Component
public class HelloFeignFallbackFactory implements FallbackFactory<HelloFeign>{

    @Override
    public HelloFeign create(Throwable throwable) {

        return new HelloFeign() {
            @Override
            public String useHello(String name) {

                //打印回退原因
                log.error("HelloFeign回退原因:{}",throwable.getMessage());

                return "System Error";
            }
        };
    }
}
