package com.example.veb2_1409_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ActivityC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);

        Button openAfromC =  findViewById(R.id.openAfromC);
        openAfromC.setOnClickListener(wiev -> {
            Intent intent = new Intent(this, ActivityA.class);
            startActivity(intent);
        });

        Button openDfromC = findViewById(R.id.openDfromC);
        openDfromC.setOnClickListener(wiev -> {
            Intent intent = new Intent(this, ActivityD.class);
            finishAffinity();
            startActivity(intent);
        });

        Button closeCfromC = findViewById(R.id.closeCfromC);
        closeCfromC.setOnClickListener(wiev -> {
            Intent intent = new Intent(this, ActivityB.class);
            startActivity(intent);
            this.finish();
        });

        Button closeStack = findViewById(R.id.closestack);
        closeStack.setOnClickListener(wiev -> finishAffinity());
    }
}