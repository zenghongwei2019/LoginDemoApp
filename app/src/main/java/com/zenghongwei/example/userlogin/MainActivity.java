package com.zenghongwei.example.userlogin;

import android.content.Context;
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
    private EditText mEtUserName;
    private EditText mEtPassWord;
    private Button mBtnLogin;
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

    public static void mainstart(Context context){
        Intent starter = new Intent(context,MainActivity.class);
        context.startActivity(starter);
    }

    private void init() {
        mEtUserName = findViewById(R.id.utext);
        mEtPassWord = findViewById(R.id.pstext);
        mBtnLogin = findViewById(R.id.loginbt);
        mBtnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        username = mEtUserName.getText().toString();
        password = mEtPassWord.getText().toString();
        Userinfo userinfo = new Userinfo();
        userinfo.setUsername(username);
        userinfo.setPassword(password);
        userinfoModel.login(userinfo,this);
    }

    @Override
    public void onSuccess(Userinfo userinfo) {
        Toast.makeText(this, getString(R.string.success), Toast.LENGTH_SHORT).show();
        SuccessActivity.successstart(MainActivity.this);
    }

    @Override
    public void onFailure() {
        Toast.makeText(this, getString(R.string.fail), Toast.LENGTH_SHORT).show();
    }
}
