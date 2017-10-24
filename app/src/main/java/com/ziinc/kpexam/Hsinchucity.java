package com.ziinc.kpexam;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class Hsinchucity extends AppCompatActivity {

    private VideoView video;
    private String videoFile="hsincity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hsinchucity);
        //設定隱藏標題
        getSupportActionBar().hide();
        //設定隱藏狀態
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN);

        video=(VideoView)findViewById(R.id.videoView);
        int id=getResources().getIdentifier(videoFile,"raw",this.getPackageName());
        final String path="android.resource://"+this.getPackageName()+"/"+id;
        video.setVideoURI(Uri.parse(path));
        video.setMediaController(new MediaController(this));
        video.start();
    }

    @Override
    public void onPause(){
        super.onStop();
        video.stopPlayback();
    }


    public void onClick(View view){

        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);}

}