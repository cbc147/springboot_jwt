package com.cbc.service.impl;

import com.cbc.mapper.SysUserMapper;
import com.cbc.pojo.SysUser;
import com.cbc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: springbootdemo
 * @Date: 2019/9/29 13:19
 * @Author: Mr.Deng
 * @Description:
 */
@Service
public class UserServiceimpl implements UserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public List<SysUser> getUser() {
        return sysUserMapper.selectAll();
    }
}
