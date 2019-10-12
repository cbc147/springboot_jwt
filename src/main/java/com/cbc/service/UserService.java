package com.cbc.service;

import com.cbc.pojo.SysUser;

import java.util.List;

/**
 * @program: springbootdemo
 * @Date: 2019/9/29 13:18
 * @Author: Mr.Deng
 * @Description:
 */
public interface UserService {

    List<SysUser> getUser();
}
