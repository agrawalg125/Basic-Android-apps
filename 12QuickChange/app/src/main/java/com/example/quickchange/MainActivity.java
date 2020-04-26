package com.example.quickchange;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    RelativeLayout relativeLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        relativeLayout=findViewById(R.id.layout);
        radioGroup= findViewById(R.id.rdgroup);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId)
                {
                    case R.id.redbtn:
                        relativeLayout.setBackgroundColor(Color.parseColor("#45CE30"));
                        break;
                    case R.id.bluebtn:
                        relativeLayout.setBackgroundColor(Color.parseColor("#74B9FF"));
                        break;
                    case R.id.greenbtn:
                        relativeLayout.setBackgroundColor(Color.parseColor("#FF3E4D"));
                        break;
                }
            }
        });
    }
}
