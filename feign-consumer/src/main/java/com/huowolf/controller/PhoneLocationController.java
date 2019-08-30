package com.huowolf.controller;

import com.huowolf.feign.PhoneLocationFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @创建人：王小伟
 * @创建时间： 2019/8/23
 * @描述：使用openFeign测试原生第三方接口
 */
@RestController
@RequestMapping("/phone")
public class PhoneLocationController {


    @Autowired
    private PhoneLocationFeign phoneLocationFeign;

    /**
     * 查询手机号的归属地
     * @return
     */
    @GetMapping("/getPhoneLocation")
    public String getPhoneLocation(){
        return phoneLocationFeign.getPhoneLocation("13322222222");
    }
}
