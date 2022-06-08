
package com.example.arguideapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;

public class Schedule extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);
    }

    public void ToMainPage(View v) {
        Intent intent = new Intent(Schedule.this, MainActivity.class);
        startActivity(intent);
    }
    public void ToProfilePage(View v) {
        Intent intent = new Intent(Schedule.this, profile.class);
        startActivity(intent);
    }

    public void ToPlanElement(View v) {
        Intent intent = new Intent(Schedule.this, saintpeterspurgplan.class);
        startActivity(intent);
    }

    public void ToAugust(View v) {
        Intent intent = new Intent(Schedule.this, August.class);
        startActivity(intent);
    }

    public void ToJuly(View v) {
        Intent intent = new Intent(Schedule.this, July.class);
        startActivity(intent);
    }
}