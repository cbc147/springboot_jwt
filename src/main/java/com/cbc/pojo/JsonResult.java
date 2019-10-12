package com.cbc.pojo;

/**
 * @program: springbootdemo
 * @Date: 2019/9/27 15:12
 * @Author: Mr.Deng
 * @Description:
 */
public class JsonResult {

    private int statue;
    private String msg;

    private Object data;

    public static JsonResult ok(Object data){
        JsonResult jsonResult = new JsonResult();
        jsonResult.setStatue(200);
        jsonResult.setMsg("ok");
        jsonResult.setData(data);
        return jsonResult;
    }

    public static JsonResult error(){
        JsonResult jsonResult = new JsonResult();
        jsonResult.setStatue(500);
        jsonResult.setMsg("错误");
        return jsonResult;
    }


    public int getStatue() {
        return statue;
    }

    public void setStatue(int statue) {
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
