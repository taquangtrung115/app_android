package com.example.appcooking.Model;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.appcooking.R;

public class VideoActivity extends AppCompatActivity {
    VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        videoView = findViewById(R.id.vdXem);
        Uri uri = Uri.parse("https://www.youtube.com/watch?v=EKnET6dDLpM");
        videoView.setVideoURI(uri);
        videoView.setMediaController(new MediaController(VideoActivity.this));
        videoView.start();
    }
}