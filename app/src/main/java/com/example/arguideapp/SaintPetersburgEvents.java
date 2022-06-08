package com.example.arguideapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SaintPetersburgEvents extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saint_petersburg_events);
    }

    public void ToMainPageFromSp(View v) {
        Intent intent = new Intent(SaintPetersburgEvents.this, MainActivity.class);
        startActivity(intent);
    }

    public void ToProfilePageFromSp(View v) {
        Intent intent = new Intent(SaintPetersburgEvents.this, profile.class);
        startActivity(intent);
    }

    public void ToCalendarPageFromSp(View v) {
        Intent intent = new Intent(SaintPetersburgEvents.this, Schedule.class);
        startActivity(intent);
    }
}