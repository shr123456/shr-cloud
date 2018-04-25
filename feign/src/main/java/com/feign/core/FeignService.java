package com.feign.core;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @auther shr
 * @date 2018/2/26
 * @time 9:55
 * @desc
 **/
@FeignClient(value = "production", fallback = FeignServiceImpl.class)

public interface FeignService {

    @RequestMapping(value = "/hi")
    public String sayHi(@RequestParam(value = "name") String name);
}
