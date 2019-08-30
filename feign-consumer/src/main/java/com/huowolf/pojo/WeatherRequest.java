package com.huowolf.pojo;

import lombok.Data;

/**
 * @创建人：王小伟
 * @创建时间： 2019/8/27
 * @描述：天气API请求实体
 */
@Data
public class WeatherRequest {

    private String version = "v1";

    private String appid = "1001";

    private String appsecret = "5566";

    private String city;

    private String ip;
}
