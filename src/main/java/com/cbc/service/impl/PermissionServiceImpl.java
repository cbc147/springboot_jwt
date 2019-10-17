package com.cbc.service.impl;

import com.cbc.mapper.SysPermissionMapper;
import com.cbc.pojo.Permission;
import com.cbc.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: springbootdemo
 * @Date: 2019/10/17 16:35
 * @Author: Mr.Deng
 * @Description:
 */
@Service
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    private SysPermissionMapper permissionMapper;
    @Override
    public List<Permission> selectAll() {
        return permissionMapper.selectAll();
    }
}
