package com.cbc.exception;

/**
 * @program: springbootdemo
 * @Date: 2019/10/15 15:37
 * @Author: Mr.Deng
 * @Description:
 */
public class MyException extends RuntimeException{
    private String msg;
    private String code;

    public MyException(String msg,String code){
        this.msg = msg;
        this.code = code;
    }


    public String getMsg() {
        return msg;
    }

    public void getMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
