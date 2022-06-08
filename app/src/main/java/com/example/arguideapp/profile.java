package com.example.arguideapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class profile extends AppCompatActivity {

    TextView Name;
    TextView Surname;

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch(requestCode) {
            case (1) : {
                if (resultCode == Activity.RESULT_OK) {
                    String newText = data.getStringExtra("SAVED_Name");
                    Name = findViewById(R.id.Name);
                    Name.setText(newText);

                    String newText1 = data.getStringExtra("SAVED_SurName");
                    Surname = findViewById(R.id.Surname);
                    Surname.setText(newText1);
                    // TODO Update your TextView.
                }
                break;
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }

    public void UserInfo(View v) {
        Intent intent = new Intent(profile.this, userinfo.class);
        intent.putExtra("SAVED_Name", ((TextView)findViewById(R.id.Name)).getText().toString());
        intent.putExtra("SAVED_SurName", ((TextView)findViewById(R.id.Surname)).getText().toString());
        //Toast.makeText(this, ((TextView)findViewById(R.id.Name)).getText().toString(), Toast.LENGTH_SHORT).show();
        startActivityForResult(intent, 1);
    }

    public void HomePage(View v) {
        Intent intent = new Intent(profile.this, MainActivity.class);
        startActivity(intent);
    }

    public void CalendarPage(View v) {
        Intent intent = new Intent(profile.this, Schedule.class);
        startActivity(intent);
    }

    public void AboutAppPage(View v) {
        Intent intent = new Intent(profile.this, AboutApp.class);
        startActivity(intent);
    }
}