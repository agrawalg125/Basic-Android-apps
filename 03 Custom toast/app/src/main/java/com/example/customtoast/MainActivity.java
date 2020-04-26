package com.example.customtoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void redclick(View v)

    {
        //Toast.makeText(this,"ok",Toast.LENGTH_SHORT);
        showCustomToast("Customised text");

    }
    public void showCustomToast(String s){

        LayoutInflater inflater=getLayoutInflater();
        View layout=inflater.inflate(R.layout.toast_custom,(ViewGroup) findViewById(R.id.toast_id));

        TextView toasttext=layout.findViewById(R.id.toast_text);
        toasttext.setText(s);


        Toast toast= new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER,0,-5);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        toast.show();
    }
}
