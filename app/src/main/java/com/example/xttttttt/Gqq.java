package com.example.xttttttt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.VideoView;
import android.widget.MediaController;
public class Gqq extends AppCompatActivity {
  private  VideoView videView;
  private Button button1;
  private Button button2;
  private Button button3;
    private MediaController mediaController;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gqq);
        intView();
    }

    private void intView() {

        videView=(VideoView) findViewById(R.id.videoView);
        button1=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              bofang();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                videView.stopPlayback();
            }
        });
    }
    private void bofang(){
        videView=(VideoView) findViewById(R.id.videoView);
        mediaController=new  MediaController(this);
        String uri="android.resource://"+getPackageName()+"/"+R.raw.video;
        videView.setVideoURI(Uri.parse(uri));
        videView.setMediaController(mediaController);
        mediaController.setMediaPlayer(videView);
        videView.start();
    }

    public void fh1(View view) {
        Toast.makeText(Gqq.this,"返回成功请选择老师听课",Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(Gqq.this,SecondActivity.class);
        startActivity(intent);
    }
}