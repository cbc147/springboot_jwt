package com.cbc.pojo;

/**
 * @program: springbootdemo
 * @Date: 2019/9/27 15:12
 * @Author: Mr.Deng
 * @Description:
 */
public class JsonResult {

    private String statue;
    private String msg;

    private Object data;

    public static JsonResult ok(Object data){
        JsonResult jsonResult = new JsonResult();
        jsonResult.setStatue("200");
        jsonResult.setMsg("ok");
        jsonResult.setData(data);
        return jsonResult;
    }

    public static JsonResult error(String statue,String msg){
        JsonResult jsonResult = new JsonResult();
        jsonResult.setStatue(statue);
        jsonResult.setMsg(msg);
        return jsonResult;
    }


    public String getStatue() {
        return statue;
    }

    public void setStatue(String statue) {
        this.statue = statue;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
