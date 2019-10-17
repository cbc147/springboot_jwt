package com.cbc.service;

import com.cbc.pojo.Permission;

import java.util.List;

/**
 * @program: springbootdemo
 * @Date: 2019/10/17 16:34
 * @Author: Mr.Deng
 * @Description:
 */
public interface PermissionService {

    public List<Permission> selectAll();
}
