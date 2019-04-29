package com.zenghongwei.example.userlogin.Model;

import com.zenghongwei.example.userlogin.Bean.Userinfo;

public interface UserinfoModel {
    void Login(Userinfo userinfo, OnUserinfoListener onUserinfoListener);
}
