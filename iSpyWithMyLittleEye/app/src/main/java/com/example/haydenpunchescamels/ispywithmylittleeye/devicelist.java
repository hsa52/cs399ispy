package com.example.haydenpunchescamels.ispywithmylittleeye;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class devicelist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.devicelist);

        getSupportActionBar().hide(); // Hide action bar

        initNavigationListeners();
    }

    private void initNavigationListeners() {
        // Set play button listener
        findViewById(R.id.camera).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), viewscreen.class);
                startActivity(intent);
            }
        });

    }

}
