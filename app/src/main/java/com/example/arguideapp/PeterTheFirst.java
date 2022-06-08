package com.example.arguideapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PeterTheFirst extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peter_the_first);
    }

    public void BackToMoreCities(View v) {
        Intent intent = new Intent(PeterTheFirst.this, MoscowEvents.class);
        startActivity(intent);
    }
}