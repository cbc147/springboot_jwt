package com.cbc.controller;

import com.cbc.exception.MyException;
import com.cbc.pojo.JsonResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springbootdemo
 * @Date: 2019/9/27 14:54
 * @Author: Mr.Deng
 * @Description:
 */
@RestController
@RequestMapping("test1")
public class HelloController extends BaseController{


    @RequestMapping(value = "/hello")
    public JsonResult hello(){
        return JsonResult.ok("hello spring boot");
    }

    @GetMapping("/ex")
    public JsonResult ex(){
       throw new MyException("MyException错误","500");
    }

    @GetMapping("/getUserId")
    public JsonResult test(){
        int userid = getUserId();
        return JsonResult.ok(userid);
    }
}
