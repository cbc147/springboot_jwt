package com.cbc.mapper;

import com.cbc.pojo.Permission;

import java.util.List;

/**
 * @program: springbootdemo
 * @Date: 2019/10/17 16:22
 * @Author: Mr.Deng
 * @Description:
 */
public interface SysPermissionMapper {
     public List<Permission> selectAll();
}
