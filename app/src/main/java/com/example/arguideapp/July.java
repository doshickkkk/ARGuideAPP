package com.example.arguideapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class July extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_july);
    }

    public void ToMainPageFromJuly(View v) {
        Intent intent = new Intent(July.this, MainActivity.class);
        startActivity(intent);
    }
    public void ToProfilePageFromJuly(View v) {
        Intent intent = new Intent(July.this, profile.class);
        startActivity(intent);
    }

    public void ToPlanElementFromJuly(View v) {
        Intent intent = new Intent(July.this, Schedule.class);
        startActivity(intent);
    }

    public void ToJuneFromJuly(View v) {
        Intent intent = new Intent(July.this, Schedule.class);
        startActivity(intent);
    }
}