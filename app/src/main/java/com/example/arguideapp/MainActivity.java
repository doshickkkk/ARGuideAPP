package com.example.arguideapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void MoreCitiesPage(View v) {
        ImageButton doSomethingButton = (ImageButton) findViewById(R.id.MoreButton);

        doSomethingButton.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MoreCitiesActivity.class);
                startActivity(intent);
            }
        });
    }

    public void CalendarPage(View v) {
        ImageButton CalendarPage = (ImageButton) findViewById(R.id.InactiveCalendarButton);

        CalendarPage.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Calendar.class);
                startActivity(intent);
            }
        });
    }

}

