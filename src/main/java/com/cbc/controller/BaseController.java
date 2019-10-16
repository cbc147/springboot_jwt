package com.cbc.controller;

import com.cbc.Interceptor.JwtInterceptor;
import com.cbc.exception.MyException;
import com.cbc.pojo.JsonResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @program: springbootdemo
 * @Date: 2019/10/10 14:28
 * @Author: Mr.Deng
 * @Description:
 */
@RestControllerAdvice
public class BaseController {

    public int getUserId(){
        HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
        return Integer.parseInt(request.getAttribute(JwtInterceptor.USER_KEY).toString());

    }


    @ExceptionHandler(value = MyException.class)
    public JsonResult handleMyException(MyException me){
        return JsonResult.error(me.getCode(),me.getMsg());
    }


    @ExceptionHandler(value = Exception.class)
    public JsonResult handleException(Exception e){
        return JsonResult.error("500",e.getMessage());
    }


}
