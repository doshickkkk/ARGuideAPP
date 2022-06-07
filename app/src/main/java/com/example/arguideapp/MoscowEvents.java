package com.example.arguideapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MoscowEvents extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moscow_events);
    }

    public void GoToHomePage(View v) {

        Intent intent = new Intent(MoscowEvents.this, MainActivity.class);
        startActivity(intent);
    }

    public void GoToProfilePage(View v) {

        Intent intent = new Intent(MoscowEvents.this, profile.class);
        startActivity(intent);
    }

    public void GoToCalendarPage(View v) {

        Intent intent = new Intent(MoscowEvents.this, Calendar.class);
        startActivity(intent);
    }
}