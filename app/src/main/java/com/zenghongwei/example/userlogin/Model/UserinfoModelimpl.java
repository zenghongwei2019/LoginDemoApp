package com.zenghongwei.example.userlogin.Model;

import com.zenghongwei.example.userlogin.Bean.Userinfo;

public class UserinfoModelimpl implements UserinfoModel{
    public void login(Userinfo userinfo, OnUserinfoListener onUserinfoListener) {
        if(userinfo.getUsername().equals("1")&&userinfo.getPassword().equals("1")){
            onUserinfoListener.onSuccess(userinfo);
        }else{
            onUserinfoListener.onFailure();
        }
    }
}
