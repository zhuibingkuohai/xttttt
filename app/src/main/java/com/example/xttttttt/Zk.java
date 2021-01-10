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

public class Zk extends AppCompatActivity {
    private VideoView videView;
    private Button button4;
    private Button button5;
    private Button button6;
    private MediaController mediaController;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zk);
        intView();
    }

    private void intView() {

        videView=(VideoView) findViewById(R.id.videoView);
        button4=(Button)findViewById(R.id.button4);
        button5=(Button)findViewById(R.id.button5);

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bofang2();
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                videView.stopPlayback();
            }
        });
    }
    private void bofang2(){
        videView=(VideoView) findViewById(R.id.videoView);
        mediaController=new  MediaController(this);
        String uri="android.resource://"+getPackageName()+"/"+R.raw.video;
        videView.setVideoURI(Uri.parse(uri));
        videView.setMediaController(mediaController);
        mediaController.setMediaPlayer(videView);
        videView.start();
    }


    public void fh2(View view) {
        Toast.makeText(Zk.this,"返回成功请选择老师听课",Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(Zk.this,SecondActivity.class);
        startActivity(intent);
    }
}