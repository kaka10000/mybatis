package com.jeff.web.entites;

import com.jeff.mybatis.po.Resource;

import java.io.Serializable;
import java.util.List;

/**
 * Created by liuren on 2017/11/4.
 */
public class ActiveUser implements Serializable{

    private String username;
    private String password;

    private List<Resource> menuList;//菜单

    private List<Resource> resList;//菜单

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Resource> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<Resource> menuList) {
        this.menuList = menuList;
    }

    public List<Resource> getResList() {
        return resList;
    }

    public void setResList(List<Resource> resList) {
        this.resList = resList;
    }

    @Override
    public String toString() {
        return "ActiveUser{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", menuList=" + menuList +
                ", resList=" + resList +
                '}';
    }
}
