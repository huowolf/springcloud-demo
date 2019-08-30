package com.huowolf.feign;

import org.springframework.stereotype.Component;

/**
 * @创建人：王小伟
 * @创建时间： 2019/8/30
 * @描述：服务降级回退类，实现HelloFeign
 */
@Component
public class HelloFeignFallback implements HelloFeign{
    @Override
    public String useHello(String name) {
        return "System Error";
    }


}
