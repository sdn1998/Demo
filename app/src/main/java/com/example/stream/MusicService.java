package com.example.stream;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MusicService extends AppCompatActivity {
    Button Play,Stop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_service);
        Play = findViewById(R.id.PlayButton);
        Stop = findViewById(R.id.StopButton);
    }

    public void stop(View view)
    {
        stopService(new Intent(this,Service_Music.class));
    }

    public void play(View view){
        startService(new Intent(this,Service_Music.class));
    }
}
