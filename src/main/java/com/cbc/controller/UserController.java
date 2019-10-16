package com.cbc.controller;

import com.cbc.pojo.JWT;
import com.cbc.pojo.JsonResult;
import com.cbc.pojo.SysUser;
import com.cbc.pojo.User;
import com.cbc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

/**
 * @program: springbootdemo
 * @Date: 2019/9/27 14:54
 * @Author: Mr.Deng
 * @Description:
 */
@RestController
@RequestMapping("user")
public class UserController extends BaseController{

    @Autowired
    private UserService userService;

    @Autowired
    private JWT jwt;

    @RequestMapping("/getUser")
    public JsonResult getUser(){
        User user = new User();
        user.setName("cbc1");
        user.setPassword("cbc1");
        user.setAge(22);
        return JsonResult.ok(user);

    }


    @PostMapping("setUser")
    public JsonResult setUser(User user){

        return JsonResult.ok(user);

    }

    @GetMapping("/getUserAll")
    public JsonResult getUserAll(){
        List<SysUser> userList = userService.getUser();
        return JsonResult.ok(userList);
    }

    @GetMapping()
    public JsonResult info(){
        return JsonResult.ok(getUserId());
    }

    @RequestMapping("/login")
    public JsonResult login(){
        String token = jwt.generateToken(10);
        HashMap<String,Object> map = new HashMap<String,Object>();
        map.put("expire", jwt.getExpire());
        map.put("token", token);
        return JsonResult.ok(map);
    }




}
