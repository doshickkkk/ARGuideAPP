package com.example.arguideapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class login extends AppCompatActivity {

    private EditText username;
    private EditText password;
    private ImageButton login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.Password);
        login = (ImageButton) findViewById(R.id.loginbutton);
    }

    public void HomePage(View v) {
        if (username.getText().toString().equals("admin") &&
                password.getText().toString().equals("admin")) {
            Intent intent = new Intent(login.this, MainActivity.class);
            startActivity(intent);
        }
        else
        {
            Toast.makeText(getApplicationContext(), "Неправильные данные!", Toast.LENGTH_SHORT).show();
        }
    }
}