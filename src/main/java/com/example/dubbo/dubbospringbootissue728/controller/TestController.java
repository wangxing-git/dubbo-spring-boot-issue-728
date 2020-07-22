package com.example.dubbo.dubbospringbootissue728.controller;

import com.example.dubbo.dubbospringbootissue728.openfeign.TestFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangxing
 * @create 2020/7/22
 */
@RestController
public class TestController {

    @Autowired
    private TestFeignClient testFeignClient;

    @GetMapping("/testFeign")
    public String testFeign() {
        return testFeignClient.test();
    }

    @GetMapping("/test")
    public String test() {
        return "success";
    }

}