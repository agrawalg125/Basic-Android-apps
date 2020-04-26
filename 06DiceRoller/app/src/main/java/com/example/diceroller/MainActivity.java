package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView ImageViewDice1,ImageViewDice2;
    private Random randNum=new Random();
    private Button rollDice;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rollDice= findViewById(R.id.button2);
        ImageViewDice1=findViewById(R.id.imageView1);
        ImageViewDice2=findViewById(R.id.imageView2);
        rollDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollTheDices();
            }
        });
    }
    private void rollTheDices()
    {
        int num= randNum.nextInt(6)+1;
        int num2=randNum.nextInt(6)+1;
        switch(num)
        {
            case 1:
                ImageViewDice1.setImageResource(R.drawable.dice1);
                break;
            case 2:
                ImageViewDice1.setImageResource(R.drawable.dice2);
                break;
            case 3:
                ImageViewDice1.setImageResource(R.drawable.dice3);
                break;
            case 4:
                ImageViewDice1.setImageResource(R.drawable.dice4);
                break;
            case 5:
                ImageViewDice1.setImageResource(R.drawable.dice5);
                break;
            case 6:
                ImageViewDice1.setImageResource(R.drawable.dice6);
                break;

        }
        switch(num2)
        {
            case 1:
                ImageViewDice2.setImageResource(R.drawable.dice1);
                break;
            case 2:
                ImageViewDice2.setImageResource(R.drawable.dice2);
                break;
            case 3:
                ImageViewDice2.setImageResource(R.drawable.dice3);
                break;
            case 4:
                ImageViewDice2.setImageResource(R.drawable.dice4);
                break;
            case 5:
                ImageViewDice2.setImageResource(R.drawable.dice5);
                break;
            case 6:
                ImageViewDice2.setImageResource(R.drawable.dice6);
                break;

        }
    }
}
