package com.example.haydenpunchescamels.ispywithmylittleeye;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

public class deviceadd extends AppCompatActivity {

    private MainGlobal mainGlobal;

    private EditText cameraName;
    private Spinner cameraType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.deviceadd);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true); // Enable back navigation

//        mainGlobal = ((MainGlobal) this.getApplication());
//        cameraName = (EditText) findViewById(R.id.deviceName);
//        cameraType = (Spinner) findViewById(R.id.chooseDevice);
//
//
//        findViewById(R.id.addDevice).setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                String cN = cameraName.getText().toString();
//                String cT = cameraType.toString();
//                mainGlobal.addCamera(cN, cT, "android.resource://com.example.haydenpunchescamels.ispywithmylittleeye/\" + R.raw.movie;");
//
//                Intent intent = new Intent(getApplicationContext(), devicelist.class);
//                startActivity(intent);
//
//                }
//            });
    }
}
