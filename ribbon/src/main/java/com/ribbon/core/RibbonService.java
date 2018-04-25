package com.ribbon.core;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @auther shr
 * @date 2018/2/23
 * @time 17:14
 * @desc
 **/
@Service
public class RibbonService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hystrixHallback")
    public String hiService(String name) {
        return restTemplate.getForObject("http://production/hi?name="+name,String.class);
    }

    public String hystrixHallback(String name) {
        return "hi,"+name+",sorry,error!";
    }
}
