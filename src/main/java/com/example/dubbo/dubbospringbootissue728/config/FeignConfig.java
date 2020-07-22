package com.example.dubbo.dubbospringbootissue728.config;

import feign.Logger;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wangxing
 * @create 2019/5/17
 */
@Configuration
@EnableFeignClients(basePackages = "com.example.dubbo.dubbospringbootissue728.openfeign")
public class FeignConfig {

    @Bean
    public Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

}