package com.zenghongwei.example.userlogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.zenghongwei.example.userlogin.Bean.Userinfo;
import com.zenghongwei.example.userlogin.Model.OnUserinfoListener;
import com.zenghongwei.example.userlogin.Model.UserinfoModelimpl;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, OnUserinfoListener {
    private EditText et_username;
    private EditText et_password;
    private Button btn_login;
    private UserinfoModelimpl userinfoModel;
    String username;
    String password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        userinfoModel = new UserinfoModelimpl();
    }

    private void init() {
        et_username = findViewById(R.id.utext);
        et_password = findViewById(R.id.pstext);
        btn_login = findViewById(R.id.loginbt);
        btn_login.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        username = et_username.getText().toString();
        password = et_password.getText().toString();
        Userinfo userinfo = new Userinfo();
        userinfo.setUsername(username);
        userinfo.setPassword(password);
        userinfoModel.Login(userinfo,this);
    }

    @Override
    public void onSuccess(Userinfo userinfo) {
        Toast.makeText(this, "登陆成功", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this,SuccessActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onFailure() {
        Toast.makeText(this, "用户名或密码错误", Toast.LENGTH_SHORT).show();
    }
}
