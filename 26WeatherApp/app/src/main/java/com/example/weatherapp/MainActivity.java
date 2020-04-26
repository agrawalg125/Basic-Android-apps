package com.example.weatherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button button;
    TextView textView;
    //https://api.openweathermap.org/data/2.5/weather?q=Paris&appid=4ecc0c1f037d12c5f364348ee0507c32

    String baseUrl="https://api.openweathermap.org/data/2.5/weather?q=";
    String API="4ecc0c1f037d12c5f364348ee0507c32";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText=findViewById(R.id.city);
        button=findViewById(R.id.button);
        textView= findViewById(R.id.result);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });
    }
}
