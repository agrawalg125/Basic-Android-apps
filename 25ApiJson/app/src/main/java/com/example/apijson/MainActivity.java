package com.example.apijson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button button;
    private RequestQueue requestQueue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        textView=findViewById(R.id.text);
        button=findViewById(R.id.button);

        //requestQueue= Volley.newRequestQueue(this);
        requestQueue=VolleySingleton.getInstance(this).getRequestQueue();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendAPIRequest();

            }
        });
    }

    public void sendAPIRequest()
    {
        String url="https://api.myjson.com/bins/1digew";

        JsonObjectRequest request=new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
        @Override
        public void onResponse(JSONObject response) {
            try {
                JSONArray jsonArray=response.getJSONArray("students");
                for(int i=0;i<jsonArray.length();i++)
                {
                    JSONObject student=jsonArray.getJSONObject(i);
                    String name=student.getString("name");
                    String email=student.getString("email");
                    int coursecount= student.getInt("course_count");

                    textView.append(name+" , "+String.valueOf(coursecount)+" , "+email+"\n");

                }

            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }, new Response.ErrorListener() {
        @Override
        public void onErrorResponse(VolleyError error) {

        }
    });
        requestQueue.add(request);

    }
}
