package com.example.progessbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    ProgressBar progressBar,progressBar2;
    Button start,end,upload;
    int progress=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar=findViewById(R.id.progressBar);
        progressBar2=findViewById(R.id.progressBarHorizontal);

        start=findViewById(R.id.start);
        end=findViewById(R.id.stop);
        upload=findViewById(R.id.upload);

        progressBar.setVisibility(View.GONE);
    }

    public void start(View view)
    {
        progressBar.setVisibility(View.VISIBLE);
    }
    public void stop(View view)
    {
        progressBar.setVisibility(View.GONE);
    }
    public void upload(View view)
    {
        fakeprogress(progress);
    }

    public void fakeprogress(final int progress)
    {
        progressBar2.setProgress(progress);

        final Thread thread= new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                fakeprogress(progress+10);
            }
        });
        thread.start();
    }
}
