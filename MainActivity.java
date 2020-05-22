package com.example.fariha.audio_player;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mediaPlayer= MediaPlayer.create(this,R.raw.ikhlas);
    }

    public void play(View view) {
        mediaPlayer.start();

    }

    public void pause(View view) {
        mediaPlayer.start();
    }

    public void video(View view) {
        Intent intent=new Intent(MainActivity.this,VideoActivity.class);
        startActivity(intent);
    }
}
