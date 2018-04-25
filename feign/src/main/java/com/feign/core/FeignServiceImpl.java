package com.feign.core;

import org.springframework.stereotype.Component;

/**
 * @auther shr
 * @date 2018/2/26
 * @time 10:30
 * @desc
 **/
@Component
public class FeignServiceImpl implements FeignService {
    @Override
    public String sayHi(String name) {
        return "sorry "+name;
    }
}
