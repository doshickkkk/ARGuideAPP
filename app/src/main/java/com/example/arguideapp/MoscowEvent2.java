package com.example.arguideapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MoscowEvent2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moscow_event2);
    }

    public void GoBack(View v) {

        Intent intent = new Intent(MoscowEvent2.this, MoscowEvents.class);
        startActivity(intent);
    }

    public void CooooomiingSOOOOn(View v) {

        Intent intent = new Intent(MoscowEvent2.this, ComingSoon.class);
        startActivity(intent);
    }
}