package com.liuxch.modal;

import java.io.Serializable;
import java.util.Date;

public class LoginLog implements Serializable{

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private String userId;

    private String ip;

    private Date loginTime;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }





}

