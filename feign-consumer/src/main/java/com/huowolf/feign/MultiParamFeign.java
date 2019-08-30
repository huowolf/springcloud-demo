package com.huowolf.feign;

import com.huowolf.pojo.WeatherRequest;
import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @创建人：王小伟
 * @创建时间： 2019/8/27
 * @描述：测试openfeign对多请求参数的支持
 * 完整天气API接口地址：https://www.tianqiapi.com/api/?version=v1&cityid=101110101&appid=1001&appsecret=5566
 * 其中appid和appsecret必须以请求参数的形式传递，其他参数可通过请求体传递
 * 参考地址：https://blog.csdn.net/zuo_zuo_blog/article/details/90723281
 *
 *
 * openfiegn get参数默认是以requestbody的形式发送的
 * 可以使用venus-cloud-starter-feign对其增强
 */
@FeignClient(name = "weather",url = "www.tianqiapi.com")
public interface MultiParamFeign {

    @GetMapping(value = "/api/")
    String getCityWeatherByGet(WeatherRequest weatherRequest);

    @PostMapping("/api/")
    String getCityWeatherByPost(@RequestParam("appid") String appid, @RequestParam("appsecret") String appsecret, @RequestBody WeatherRequest weatherRequest);
}
