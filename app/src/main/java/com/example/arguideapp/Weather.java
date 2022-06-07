package com.example.arguideapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Weather extends AppCompatActivity {

    private TextView temp_info;
    private TextView temp_max;
    private TextView temp_min;
    private TextView description;
    private TextView temp_feels;
    private TextView pressure;
    private TextView humidity;
    private TextView icon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        temp_info = findViewById(R.id.temperature_field);
        description = findViewById(R.id.description);
        temp_feels = findViewById(R.id.FeelsLike);
        temp_max = findViewById(R.id.maxTemp);
        temp_min = findViewById(R.id.minTemp);
        pressure = findViewById(R.id.pressure);
        humidity = findViewById(R.id.humidity);
        icon = findViewById(R.id.weather_icon);
        new GetURLData().execute(url);
    }


    String url = "https://api.openweathermap.org/data/2.5/weather?q=Moscow&appid=92a7a0088c1530207c6e4d38e7e58027&units=metric&lang=ru";
    String date;

    @SuppressLint("StaticFieldLeak")
    public class GetURLData extends AsyncTask<String, String, String> {

        // Будет выполнено до отправки данных по URL
        protected void onPreExecute() {
            super.onPreExecute();
            //temp_info.setText("Ожидайте...");
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
                JSONArray jsonArray = new JSONArray(result);
                // Обрабатываем JSON и устанавливаем данные в текстовые надписи
                temp_info.setText(jsonObject.getJSONObject("main").getInt("temp") + "°С");
                temp_feels.setText("Ощущается: " + jsonObject.getJSONObject("main").getInt("feels_like") + "°С");
                temp_max.setText(jsonObject.getJSONObject("main").getInt("temp_max") + "°");
                temp_min.setText(jsonObject.getJSONObject("main").getInt("temp_min") + "°");
                pressure.setText("Давление: " + jsonObject.getJSONObject("main").getInt("pressure") + " Па");
                humidity.setText("Влажность: " + jsonObject.getJSONObject("main").getInt("humidity") + " %");
                icon.setText(jsonArray.getJSONArray("weather")[0].getJsonString("icon") + "%");

//
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

}