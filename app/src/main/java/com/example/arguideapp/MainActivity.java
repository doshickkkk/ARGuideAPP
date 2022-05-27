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
        Intent intent = new Intent(MainActivity.this, MoreCitiesActivity.class);
        startActivity(intent);
    }

    public void CalendarPage(View v) {
                Intent intent = new Intent(MainActivity.this, Calendar.class);
                startActivity(intent);
    }


}

