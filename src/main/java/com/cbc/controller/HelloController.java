package com.cbc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springbootdemo
 * @Date: 2019/9/27 14:54
 * @Author: Mr.Deng
 * @Description:
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public Object hello(){
        return "hello spring boot";
    }
}
