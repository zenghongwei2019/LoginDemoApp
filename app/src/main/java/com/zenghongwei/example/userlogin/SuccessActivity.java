package com.zenghongwei.example.userlogin;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SuccessActivity extends AppCompatActivity {

    private Button mBtnQuit;
    public static void successstart(Context context){
        Intent starter = new Intent(context,SuccessActivity.class);
        context.startActivity(starter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);
        mBtnQuit = findViewById(R.id.btn_quit);
        mBtnQuit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SuccessActivity.this, getString(R.string.quit), Toast.LENGTH_SHORT).show();
                MainActivity.mainstart(SuccessActivity.this);
            }
        });
    }

}
