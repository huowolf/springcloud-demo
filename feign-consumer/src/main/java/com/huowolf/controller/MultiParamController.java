package com.huowolf.controller;

import cn.hutool.core.text.UnicodeUtil;
import com.huowolf.feign.MultiParamFeign;
import com.huowolf.pojo.WeatherRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @创建人：王小伟
 * @创建时间： 2019/8/27
 * @描述：测试openfeign对多请求参数的支持
 *
 */
@RestController
@Slf4j
public class MultiParamController {

    @Autowired
    private MultiParamFeign multiParamFeign;

    @GetMapping(value = "/getWeather",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String getWeather(){
        WeatherRequest request = new WeatherRequest();
        request.setCity("北京");

        log.info("请求参数："+request);
        String weather = multiParamFeign.getCityWeatherByGet(request);

        //return UnicodeUtil.toString(weather);
        return weather;
    }

    @PostMapping(value = "/getWeatherInfo",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String getWeatherInfo(@RequestBody WeatherRequest weatherRequest){

        return multiParamFeign.getCityWeatherByPost(weatherRequest.getAppid(),weatherRequest.getAppsecret(),weatherRequest);
    }
}
