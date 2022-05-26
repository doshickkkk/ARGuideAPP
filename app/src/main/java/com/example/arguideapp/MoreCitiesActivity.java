package com.example.arguideapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MoreCitiesActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_cities);


    }

    public void GoToHomePage(View v) {
        ImageButton GoToHomePage = (ImageButton) findViewById(R.id.ActiveHomePageButton);

        GoToHomePage.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                Intent intent = new Intent(MoreCitiesActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}