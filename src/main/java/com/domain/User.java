package com.domain;

/**
 * Created by wangyong on 2017/5/21.
 */
public class User {

    private String userName;

    private String userDesc;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserDesc() {
        return userDesc;
    }

    public void setUserDesc(String userDesc) {
        this.userDesc = userDesc;
    }

    public User(String userName, String userDesc) {
        this.userName = userName;
        this.userDesc = userDesc;
    }

    public User() {
    }
}
