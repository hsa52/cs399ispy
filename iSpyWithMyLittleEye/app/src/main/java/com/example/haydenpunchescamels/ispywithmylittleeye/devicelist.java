package com.example.haydenpunchescamels.ispywithmylittleeye;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class devicelist extends AppCompatActivity {

    public MainGlobal mainGlobal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.devicelist);
//        mainGlobal = (MainGlobal) this.getApplication();
//        mainGlobal.camera.add("Sfdsf");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true); // Enable back navigation

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

        findViewById(R.id.camera2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), viewscreen.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.camera3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), viewscreen.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.edit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), editdevice.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.add).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), deviceadd.class);
                startActivity(intent);
            }
        });

    }

}
