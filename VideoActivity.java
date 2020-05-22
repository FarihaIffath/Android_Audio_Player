package com.example.fariha.audio_player;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoActivity extends AppCompatActivity {
    MediaController mediaController;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        mediaController=new MediaController(this);
        VideoView videoView=findViewById(R.id.video);
        Uri uri=Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.sunflower);
        videoView.setMediaController(mediaController);
        videoView.setVideoURI(uri);
        videoView.start();


    }
}
