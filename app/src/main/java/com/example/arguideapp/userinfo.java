package com.example.arguideapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
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
    EditText surname;
    String SAVED_SURNAME = "saved_SurName";
    String SAVED_NAME = "saved_Name";
    SharedPreferences sPref;
    ImageButton backarrow;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userinfo);
        name = findViewById(R.id.ProfileName);
        surname = findViewById(R.id.profileSurname);
        backarrow = (ImageButton) findViewById(R.id.backarrow);
        loadText();
        name.setText(getIntent().getStringExtra("SAVED_Name"));
        surname.setText(getIntent().getStringExtra("SAVED_SurName"));

    }

    public void BackToProfile(View v) {
       // saveText();
        SAVED_NAME = String.valueOf(((EditText)findViewById(R.id.ProfileName)).getText());
        SAVED_SURNAME = String.valueOf(((EditText)findViewById(R.id.profileSurname)).getText());
        Intent resultIntent = new Intent();
        resultIntent.putExtra("SAVED_Name", SAVED_NAME);
        resultIntent.putExtra("SAVED_SurName", SAVED_SURNAME);
        setResult(Activity.RESULT_OK, resultIntent);
        finish();
    }

    void saveText() {
        sPref = getPreferences(MODE_PRIVATE);
        Editor ed = sPref.edit();
        ed.putString(SAVED_NAME, name.getText().toString());
        ed.commit();
        ed.putString(SAVED_SURNAME, surname.getText().toString());
        ed.commit();
        Toast.makeText(this, "Данные сохранены", Toast.LENGTH_SHORT).show();

    }

    void loadText() {
//        sPref = getPreferences(MODE_PRIVATE);
//        String savedText = sPref.getString(SAVED_NAME, "");
//        name.setText(savedText);
//        String savedText1 = sPref.getString(SAVED_SURNAME, "");
//        surname.setText(savedText1);


    }

}