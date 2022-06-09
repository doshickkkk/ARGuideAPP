package com.example.arguideapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MoscowEvent3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moscow_event3);
    }

    public void GoBack2(View v) {

        Intent intent = new Intent(MoscowEvent3.this, MoscowEvents.class);
        startActivity(intent);
    }

    public void SoonYeah(View v) {

        Intent intent = new Intent(MoscowEvent3.this, ComingSoon.class);
        startActivity(intent);
    }
}