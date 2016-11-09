package com.example.haydenpunchescamels.ispywithmylittleeye;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.VideoView;

public class viewscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewscreen);



        VideoView mVideoView = (VideoView) findViewById(R.id.videoView);
        String uriPath = "android.resource://com.example.haydenpunchescamels.ispywithmylittleeye/" + R.raw.movie;
        Uri uri2 = Uri.parse(uriPath);
        mVideoView.setVideoURI(uri2);
        mVideoView.requestFocus();
        mVideoView.start();
    }





}
