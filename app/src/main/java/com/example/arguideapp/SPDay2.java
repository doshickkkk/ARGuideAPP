package com.example.arguideapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SPDay2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spday2);
    }

    public void ToProfileFrom2(View v) {
        Intent intent = new Intent(SPDay2.this, profile.class);
        startActivity(intent);
    }

    public void ToHomeFrom2(View v) {
        Intent intent = new Intent(SPDay2.this, MainActivity.class);
        startActivity(intent);
    }

    public void ToCalendarFrom2(View v) {
        Intent intent = new Intent(SPDay2.this, Schedule.class);
        startActivity(intent);
    }

    public void ToFirst(View v) {
        Intent intent = new Intent(SPDay2.this, saintpeterspurgplan.class);
        startActivity(intent);
    }
}