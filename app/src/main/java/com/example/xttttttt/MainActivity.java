package com.example.xttttttt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Map;

import javax.security.auth.login.LoginException;

public class MainActivity extends AppCompatActivity {
private EditText user;
private EditText password;
private Button button1;
private Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user=(EditText)findViewById(R.id.et_username);
        password=(EditText)findViewById(R.id.et_password);
        button1=(Button)findViewById(R.id.button1);



        }
        public  void  sd(View view){
        String strusername=user.getText().toString();
        String strpassword=password.getText().toString();
        if(strusername.equals("xty")&& strpassword.equals("123")){
            Toast.makeText(MainActivity.this,"用户名和密码正确",Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(MainActivity.this,SecondActivity.class);
            startActivity(intent);
        }
        else {
            Toast.makeText(MainActivity.this,"用户名和密码错误",Toast.LENGTH_SHORT).show();
        }
        }





    }
