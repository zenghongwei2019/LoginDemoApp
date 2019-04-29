package com.zenghongwei.example.userlogin.Model;

import com.zenghongwei.example.userlogin.Bean.Userinfo;

public class UserinfoModelimpl {
    public void Login(Userinfo userinfo, OnUserinfoListener onUserinfoListener) {
        if(userinfo.getUsername().equals("17023143")&&userinfo.getPassword().equals("password17023143")){
            onUserinfoListener.onSuccess(userinfo);
        }else{
            onUserinfoListener.onFailure();
        }
    }
}
