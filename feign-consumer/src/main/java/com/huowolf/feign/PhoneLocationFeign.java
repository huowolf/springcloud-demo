package com.huowolf.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @创建人：王小伟
 * @创建时间： 2019/8/23
 * @描述：查询手机号归属地API
 * API完整地址：http://mobsec-dianhua.baidu.com/dianhua_api/open/location?tel=13322222222
 */
@FeignClient(name="baidu",url = "http://mobsec-dianhua.baidu.com/")
public interface PhoneLocationFeign {


    @GetMapping("/dianhua_api/open/location")
    String getPhoneLocation(@RequestParam("tel") String tel);
}
