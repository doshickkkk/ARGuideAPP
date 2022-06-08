package com.example.arguideapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    private TextView min_max;
    String icon_id_main;
    private ImageView icon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        min_max = findViewById(R.id.min_max_temperature);
        new GetURLData().execute(url);
        icon = findViewById(R.id.weather_icon);
    }

    String url = "https://api.openweathermap.org/data/2.5/weather?q=Moscow&appid=92a7a0088c1530207c6e4d38e7e58027&units=metric&lang=ru";

    @SuppressLint("StaticFieldLeak")
    private class GetURLData extends AsyncTask<String, String, String> {

        // Будет выполнено до отправки данных по URL
        protected void onPreExecute() {
            super.onPreExecute();
            min_max.setText("Ожидайте...");
        }

        // Будет выполняться во время подключения по URL
        @Override
        protected String doInBackground(String... strings) {
            HttpURLConnection connection = null;
            BufferedReader reader = null;

            try {
                // Создаем URL подключение, а также HTTP подключение
                URL url = new URL(strings[0]);
                connection = (HttpURLConnection) url.openConnection();
                connection.connect();

                // Создаем объекты для считывания данных из файла
                InputStream stream = connection.getInputStream();
                reader = new BufferedReader(new InputStreamReader(stream));

                // Генерируемая строка
                StringBuilder buffer = new StringBuilder();
                String line = "";

                // Считываем файл и записываем все в строку
                while ((line = reader.readLine()) != null)
                    buffer.append(line).append("\n");

                // Возвращаем строку
                return buffer.toString();

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                // Закрываем соединения
                if (connection != null)
                    connection.disconnect();

                try {
                    if (reader != null)
                        reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            return null;
        }

        // Выполняется после завершения получения данных
        @SuppressLint("SetTextI18n")
        @Override
        protected void onPostExecute(String result) {
            super.onPostExecute(result);

            // Конвертируем JSON формат и выводим данные в текстовом поле
            try {
                JSONObject jsonObject = new JSONObject(result);
                min_max.setText(jsonObject.getJSONObject("main").getInt("temp_min") + "..." + jsonObject.getJSONObject("main").getInt("temp_max") + "°С");
                icon_id_main = jsonObject.getJSONArray("weather").getJSONObject(0).getString("icon");

                switch (icon_id_main) {
                    case "01d":
                        icon.setImageResource(R.drawable.d01);
                        break;
                    case "02d":
                        icon.setImageResource(R.drawable.d02);
                        break;
                    case "03d":
                        icon.setImageResource(R.drawable.d03);
                        break;
                    case "04d":
                        icon.setImageResource(R.drawable.d04);
                        break;
                    case "09d":
                        icon.setImageResource(R.drawable.d09);
                        break;
                    case "10d":
                        icon.setImageResource(R.drawable.d10);
                        break;
                    case "11d":
                        icon.setImageResource(R.drawable.d11);
                        break;
                    case "13d":
                        icon.setImageResource(R.drawable.d13);
                        break;
                    case "50d":
                        icon.setImageResource(R.drawable.d50);
                        break;
                    case "01n":
                        icon.setImageResource(R.drawable.n01);
                        break;
                    case "02n":
                        icon.setImageResource(R.drawable.n02);
                        break;
                    case "03n":
                        icon.setImageResource(R.drawable.n03);
                        break;
                    case "04n":
                        icon.setImageResource(R.drawable.n04);
                        break;
                    case "09n":
                        icon.setImageResource(R.drawable.n09);
                        break;
                    case "10n":
                        icon.setImageResource(R.drawable.n10);
                        break;
                    case "11n":
                        icon.setImageResource(R.drawable.n11);
                        break;
                    case "13n":
                        icon.setImageResource(R.drawable.n13);
                        break;
                    case "50n":
                        icon.setImageResource(R.drawable.n50);
                        break;
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public void MoreCitiesPage(View v) {
        Intent intent = new Intent(MainActivity.this, MoreCitiesActivity.class);
        startActivity(intent);
    }

    public void CalendarPage(View v) {
                Intent intent = new Intent(MainActivity.this, Schedule.class);
                startActivity(intent);
    }

    public void MoscowPage(View v) {
        Intent intent = new Intent(MainActivity.this, MoscowEvents.class);
        startActivity(intent);
    }

    public void WeatherPage(View v) {
        Intent intent = new Intent(MainActivity.this, Weather.class);
        startActivity(intent);
    }

    public void ProfilePage(View v) {
        Intent intent = new Intent(MainActivity.this, profile.class);
        startActivity(intent);
    }

    public void ToSP(View v) {
        Intent intent = new Intent(MainActivity.this, SaintPetersburgEvents.class);
        startActivity(intent);
    }


}

