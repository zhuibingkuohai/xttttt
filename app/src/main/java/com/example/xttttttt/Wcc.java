package com.example.xttttttt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class Wcc extends AppCompatActivity {

    private VideoView videView;
    private Button button7;
    private Button button8;
    private Button button9;
    private MediaController mediaController;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gqq);
        intView();
    }

    private void intView() {

        videView=(VideoView) findViewById(R.id.videoView);
        button7=(Button)findViewById(R.id.button1);
        button8=(Button)findViewById(R.id.button2);

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bofang3();
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                videView.stopPlayback();
            }
        });
    }
    private void bofang3(){
        videView=(VideoView) findViewById(R.id.videoView);
        mediaController=new  MediaController(this);
        String uri="android.resource://"+getPackageName()+"/"+R.raw.video;
        videView.setVideoURI(Uri.parse(uri));
        videView.setMediaController(mediaController);
        mediaController.setMediaPlayer(videView);
        videView.start();
    }


    public void fh3(View view) {
        Toast.makeText(Wcc.this,"返回成功请选择老师听课",Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(Wcc.this,SecondActivity.class);
        startActivity(intent);
    }
}