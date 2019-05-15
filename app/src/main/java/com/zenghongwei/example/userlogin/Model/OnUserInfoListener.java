package com.zenghongwei.example.userlogin.Model;

import com.zenghongwei.example.userlogin.Bean.UserInfo;

public interface OnUserInfoListener {

    void onSuccess(UserInfo userinfo);

    void onFailure();
}
