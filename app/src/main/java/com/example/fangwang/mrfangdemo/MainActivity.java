package com.example.fangwang.mrfangdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "我靠", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "这是主分支的代码", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "测试分支修改", Toast.LENGTH_SHORT).show();
    }
}
