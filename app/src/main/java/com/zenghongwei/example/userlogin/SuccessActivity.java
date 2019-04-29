package com.zenghongwei.example.userlogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SuccessActivity extends AppCompatActivity {
    private Button btn_quit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);
        btn_quit = findViewById(R.id.btn_quit);
        btn_quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SuccessActivity.this, "退出成功", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SuccessActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
