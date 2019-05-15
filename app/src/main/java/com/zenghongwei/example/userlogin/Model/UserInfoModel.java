package com.zenghongwei.example.userlogin.Model;

import com.zenghongwei.example.userlogin.Bean.UserInfo;

public interface UserInfoModel {

    void login(UserInfo userinfo, OnUserInfoListener onUserinfoListener);
}
