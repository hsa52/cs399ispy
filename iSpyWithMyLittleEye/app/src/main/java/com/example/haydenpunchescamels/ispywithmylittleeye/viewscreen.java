package com.example.haydenpunchescamels.ispywithmylittleeye;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class viewscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewscreen);
    }

    videoView mVideoView = (videoView) findViewById(R.id.videoView);
    // VideoView mVideoView = new VideoView(this);
    String uriPath = "android.resource://com.example.haydenpunchescamels.ispywithmylittleeye/" + R.raw.movie;
    Uri uri2 = Uri.parse(uriPath);
    mVideoView.setVideoURI(uri2);
    mVideoView.requestFocus();
    mVideoView.start();
}
