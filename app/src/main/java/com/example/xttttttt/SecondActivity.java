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
        Toast.makeText(SecondActivity.this,"用户名和密码正确",Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(SecondActivity.this,Gqq.class);
        startActivity(intent);
    }
}