package com.zenghongwei.example.userlogin.Model;

import com.zenghongwei.example.userlogin.Bean.Userinfo;

public interface OnUserinfoListener {
    void onSuccess(Userinfo userinfo);
    void onFailure();
}
