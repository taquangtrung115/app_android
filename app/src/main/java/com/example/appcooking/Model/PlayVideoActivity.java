package com.example.appcooking.Model;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.Toast;

import com.example.appcooking.R;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class PlayVideoActivity extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener{
    YouTubePlayerView youTubePlayerView;
    String id = "";
    int rqvideo = 12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_video);
        youTubePlayerView = findViewById(R.id.playvideo);

        Intent intent = getIntent();
        id = intent.getStringExtra("idVideoYoutube");
        Toast.makeText(this, id, Toast.LENGTH_SHORT).show();
        youTubePlayerView.initialize(VideoActivity.APIKey,this);
    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
        youTubePlayer.loadVideo(id);
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
        if (youTubeInitializationResult.isUserRecoverableError())
        {
            youTubeInitializationResult.getErrorDialog(PlayVideoActivity.this,rqvideo);
        }
        else {
            Toast.makeText(this, "Lỗi!", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == rqvideo)
        {
            youTubePlayerView.initialize(VideoActivity.APIKey,PlayVideoActivity.this);
        }
        super.onActivityResult(requestCode, resultCode, data);
    }
}