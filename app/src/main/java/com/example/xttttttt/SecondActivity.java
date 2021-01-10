package com.example.xttttttt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

    }

    public void qqb(View view) {
        Toast.makeText(SecondActivity.this,"欢迎来到葛茜倩老师的直播间",Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(SecondActivity.this,Gqq.class);
        startActivity(intent);
    }

    public void zkb(View view) {
        Toast.makeText(SecondActivity.this,"欢迎来到周坤老师的直播间",Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(SecondActivity.this,Zk.class);
        startActivity(intent);
    }

    public void ccb(View view) {
        Toast.makeText(SecondActivity.this,"欢迎来到韦存存老师的直播间",Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(SecondActivity.this,Wcc.class);
        startActivity(intent);
    }
}