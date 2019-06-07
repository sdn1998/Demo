package com.example.stream;

import android.media.MediaPlayer;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        videoView = findViewById(R.id.videoView);
    }

    public void stream(View view) {
        String link = "https://seehiphop.com/wp-content/uploads/2019/04/The_Chainsmokers_Ft_Ty_Dolla_Sign_Bulby_-_Do_You_Mean.mp3";
        Uri uri = Uri.parse(link);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, uri);
        mediaPlayer.start();
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }}
        );
    }
}
