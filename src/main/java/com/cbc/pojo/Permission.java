package com.cbc.pojo;

import java.util.Date;

/**
 * @program: springbootdemo
 * @Date: 2019/10/17 16:23
 * @Author: Mr.Deng
 * @Description:
 */
public class Permission {
    private int id;
    private  String name;
    private int type;
    private String url;
    private String percode;
    private int parentid;
    private String parentids;
    private int sort;
    private int available;
    private String escription;
    private Date create_time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPercode() {
        return percode;
    }

    public void setPercode(String percode) {
        this.percode = percode;
    }

    public int getParentid() {
        return parentid;
    }

    public void setParentid(int parentid) {
        this.parentid = parentid;
    }

    public String getParentids() {
        return parentids;
    }

    public void setParentids(String parentids) {
        this.parentids = parentids;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public String getEscription() {
        return escription;
    }

    public void setEscription(String escription) {
        this.escription = escription;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreatetime(Date create_time) {
        this.create_time = create_time;
    }
}
