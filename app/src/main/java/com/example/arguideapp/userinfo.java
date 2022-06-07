package com.example.arguideapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.EditText;
import android.widget.Toast;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class userinfo extends AppCompatActivity {

    EditText name;
    final String SAVED_TEXT = "saved_text";
    SharedPreferences sPref;
    ImageButton backarrow;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userinfo);
        name = findViewById(R.id.ProfileName);
        backarrow = (ImageButton) findViewById(R.id.backarrow);
        loadText();
    }

    public void BackToProfile(View v) {
        Intent intent = new Intent(userinfo.this, profile.class);
        saveText();
        intent.putExtra("SAVED_TEXT", SAVED_TEXT);
        startActivity(intent);
    }

    void saveText() {
        sPref = getPreferences(MODE_PRIVATE);
        Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT, name.getText().toString());
        ed.commit();
        Toast.makeText(this, "Данные сохранены", Toast.LENGTH_SHORT).show();

    }

    void loadText() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT, "");
        name.setText(savedText);
    }

}