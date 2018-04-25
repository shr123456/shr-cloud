package com.ribbon.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther shr
 * @date 2018/2/23
 * @time 17:14
 * @desc
 **/
@RestController
public class RibbonController {
    @Autowired
    RibbonService ribbonService;
    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name){
        return ribbonService.hiService(name);
    }
}
