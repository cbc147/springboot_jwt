package com.cbc.controller;

import com.cbc.pojo.JsonResult;
import com.cbc.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springbootdemo
 * @Date: 2019/10/17 16:37
 * @Author: Mr.Deng
 * @Description:
 */
@RestController
@RequestMapping("permission")
public class PermissionController {
    @Autowired
    private PermissionService permissionService;

    @RequestMapping("/selectAll")
    public JsonResult selectAll(){
        return JsonResult.ok(permissionService.selectAll());
    }
}
