package com.example.burgerrating;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RatingBar ratingBar;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ratingBar=findViewById(R.id.ratingBar);
        textView=findViewById(R.id.textView);
    }

    public void submit(View view)
    {
        float ratingval=ratingBar.getRating();

        if(ratingval<=2)
        {
            textView.setText("Rating :"+ratingval+"\n Sorry for inconvinience");
        }
        else if(ratingval<=3)
        {
            textView.setText("Rating :"+ratingval+"\n We will try better next time");
        }
        else if(ratingval<=4)
        {
            textView.setText("Rating :"+ratingval+"\n Hope we see you soon again");
        }
        else
        {
            textView.setText("Rating :"+ratingval+"\n Thank you"+"\n"+"We are constantly improving");
        }
    }
}
