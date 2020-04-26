package com.example.truthdare;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private Button button;
    private Random random=new Random();
    private int lastDir;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button= findViewById(R.id.button);
        imageView=findViewById(R.id.imageView);
    }
    public void spinBottle(View view)
    {
        int newDir=random.nextInt(360)+360;
        float pivotX=imageView.getWidth()/2;
        float pivotY=imageView.getHeight()/2;
        Animation rotate = new RotateAnimation(lastDir,newDir,pivotX,pivotY);
        rotate.setDuration(3000);
        rotate.setFillAfter(true);
        rotate.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                button.setEnabled(false);
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                button.setEnabled(true);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        lastDir=newDir;
        imageView.startAnimation(rotate);

    }

}
