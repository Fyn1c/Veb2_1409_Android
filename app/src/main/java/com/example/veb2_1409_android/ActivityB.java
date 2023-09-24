package com.example.veb2_1409_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        Button openCfromB = findViewById(R.id.openCfromB);

        openCfromB.setOnClickListener(wiev ->{
            Intent intent = new Intent(this, ActivityC.class);
            startActivity(intent);
        });
    }
}