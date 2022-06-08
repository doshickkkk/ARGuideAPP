package com.example.arguideapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MoreCitiesActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_cities);

    }

    public void GoToHomePage(View v) {

        Intent intent = new Intent(MoreCitiesActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void CalendarPage(View v) {

        Intent intent = new Intent(MoreCitiesActivity.this, Schedule.class);
        startActivity(intent);

    }

    public void MoscowPage(View v) {

        Intent intent = new Intent(MoreCitiesActivity.this, MoscowEvents.class);
        startActivity(intent);

    }

    public void ProfilePage(View v) {

        Intent intent = new Intent(MoreCitiesActivity.this, profile.class);
        startActivity(intent);

    }
}