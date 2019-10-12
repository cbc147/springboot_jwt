package com.cbc.controller;

import com.cbc.Interceptor.JwtInterceptor;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @program: springbootdemo
 * @Date: 2019/10/10 14:28
 * @Author: Mr.Deng
 * @Description:
 */
public class BaseController {

    public int getUserId(){
        HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
        return Integer.parseInt(request.getAttribute(JwtInterceptor.USER_KEY).toString());

    }
}
