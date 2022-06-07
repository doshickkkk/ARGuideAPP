package com.example.arguideapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class profile extends AppCompatActivity {

    TextView Name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Name = findViewById(R.id.Name);
        Intent intent = getIntent();
        //String savedText = intent.getExtras().getString("SAVED_TEXT");
        //Name.setText(savedText);


    }

    public void UserInfo(View v) {
        Intent intent = new Intent(profile.this, userinfo.class);
        startActivity(intent);
    }

    public void HomePage(View v) {
        Intent intent = new Intent(profile.this, MainActivity.class);
        startActivity(intent);
    }

    public void CalendarPage(View v) {
        Intent intent = new Intent(profile.this, Calendar.class);
        startActivity(intent);
    }

    public void AboutAppPage(View v) {
        Intent intent = new Intent(profile.this, AboutApp.class);
        startActivity(intent);
    }
}