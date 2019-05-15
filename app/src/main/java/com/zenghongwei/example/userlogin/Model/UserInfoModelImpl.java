package com.zenghongwei.example.userlogin.Model;

import com.zenghongwei.example.userlogin.Bean.UserInfo;

public class UserInfoModelImpl implements UserInfoModel {

    public void login(UserInfo userinfo, OnUserInfoListener onUserinfoListener) {
        if (userinfo.getUsername().equals("17023143") && userinfo.getPassword().equals("password17023143")) {
            onUserinfoListener.onSuccess(userinfo);
        } else {
            onUserinfoListener.onFailure();
        }
    }
}
