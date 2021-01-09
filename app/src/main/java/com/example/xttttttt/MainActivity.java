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
        Map<String, String> userInfo = SaveInfo.getSaveInformation(this);
        if(userInfo!=null){
            user.setText(userInfo.get("username"));
            password.setText(userInfo.get("password_1"));

        }
        user=(EditText)findViewById(R.id.et_username);
        password=(EditText)findViewById(R.id.et_password);
        button1=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);
        button1.setOnClickListener(new  MyButton());

    }
    public  class  MyButton implements View.OnClickListener{
        @Override
        public  void onClick(View view) {
            String username = user.getText().toString().trim();
            String password_1 = password.getText().toString().trim();
            switch ((view.getId())) {
                case R.id.button1:
                    if (TextUtils.isEmpty((username)) || TextUtils.isEmpty(password_1)) {
                        Toast.makeText(MainActivity.this, "密码或账号不能为空", Toast.LENGTH_SHORT).show();

                    }
                    Toast.makeText(MainActivity.this, "登录成功", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, LoginException.class);
                    startActivity(intent);
                    break;
                case  R.id.button2:
                    Intent intent1=new Intent(MainActivity.this,SecondActivity.class);
                            startActivity(intent1);
                    break;
            }



        }
    }
}