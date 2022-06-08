package com.example.arguideapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class August extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_august);
    }

    public void ToMainPageFromAugust(View v) {
        Intent intent = new Intent(August.this, MainActivity.class);
        startActivity(intent);
    }
    public void ToProfilePageFromAugust(View v) {
        Intent intent = new Intent(August.this, profile.class);
        startActivity(intent);
    }

    public void ToJuleElementFromAugust(View v) {
        Intent intent = new Intent(August.this, Schedule.class);
        startActivity(intent);
    }

    public void ToJuneFromAugust(View v) {
        Intent intent = new Intent(August.this, Schedule.class);
        startActivity(intent);
    }
}