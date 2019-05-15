package com.zenghongwei.example.userlogin;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.zenghongwei.example.userlogin.Bean.UserInfo;
import com.zenghongwei.example.userlogin.Model.OnUserInfoListener;
import com.zenghongwei.example.userlogin.Model.UserInfoModelImpl;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, OnUserInfoListener {

    private EditText mEtUserName;
    private EditText mEtPassWord;
    private UserInfoModelImpl mUserInfoModelImpl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        mUserInfoModelImpl = new UserInfoModelImpl();
    }

    public static void mainStart(Context context) {
        Intent starter = new Intent(context, MainActivity.class);
        context.startActivity(starter);
    }

    private void init() {
        mEtUserName = findViewById(R.id.et_username);
        mEtPassWord = findViewById(R.id.et_password);
        Button loginBtn = findViewById(R.id.btn_login);
        loginBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String username = mEtUserName.getText().toString();
        String password = mEtPassWord.getText().toString();
        UserInfo userinfo = new UserInfo();
        userinfo.setUsername(username);
        userinfo.setPassword(password);
        mUserInfoModelImpl.login(userinfo, this);
    }

    @Override
    public void onSuccess(UserInfo userinfo) {
        Toast.makeText(this, getString(R.string.success), Toast.LENGTH_SHORT).show();
        SuccessActivity.successStart(MainActivity.this);
    }

    @Override
    public void onFailure() {
        Toast.makeText(this, getString(R.string.fail), Toast.LENGTH_SHORT).show();
    }
}
