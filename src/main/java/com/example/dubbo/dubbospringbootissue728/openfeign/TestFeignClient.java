package com.example.dubbo.dubbospringbootissue728.openfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author wangxing
 * @create 2020/7/22
 */
@FeignClient(
        name = "test-openfeign-dubbo",
        path = "/"
)
public interface TestFeignClient {

    @GetMapping("/test")
    String test();

}