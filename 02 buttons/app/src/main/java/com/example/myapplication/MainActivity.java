package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Button button,button2;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        button = findViewById(R.id.mybtn);
//        button2= findViewById(R.id.mybtn2);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.d("test2","hello world is clicked");
//            }
//        });
//        button2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.d("test","hey android is clicked");
//            }
//        });
    }
    public void blue(View v)
    {
        Context context= getApplicationContext();
        CharSequence text="blue button is pressed";
        int duration= Toast.LENGTH_SHORT;
        Toast t=Toast.makeText(context,text,duration);
        t.show();
    }
    public void white(View v)
    {
        Context context= getApplicationContext();
        CharSequence text="white button is pressed";
        int duration= Toast.LENGTH_SHORT;
        Toast t=Toast.makeText(context,text,duration);
        t.show();
    }
}
