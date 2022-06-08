package com.example.arguideapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class saintpeterspurgplan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saintpeterspurgplan);
    }

    public void ToSecondDay(View v) {
        Intent intent = new Intent(saintpeterspurgplan.this, SPDay2.class);
        startActivity(intent);
    }

    public void ToCalendar(View v) {
        Intent intent = new Intent(saintpeterspurgplan.this, Schedule.class);
        startActivity(intent);
    }

    public void ToMain(View v) {
        Intent intent = new Intent(saintpeterspurgplan.this, MainActivity.class);
        startActivity(intent);
    }

    public void ToProfile(View v) {
        Intent intent = new Intent(saintpeterspurgplan.this, profile.class);
        startActivity(intent);
    }
}