package com.example.apijson;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class VolleySingleton {


    private static VolleySingleton mInstance;
    private RequestQueue mrequestQueue;

    public VolleySingleton(Context context)
    {
        mrequestQueue= Volley.newRequestQueue(context.getApplicationContext());

    }

    public static synchronized VolleySingleton getInstance(Context context)
    {
        if(mInstance==null)
        {
            mInstance=new VolleySingleton(context);
        }
        return mInstance;
    }


    public RequestQueue getRequestQueue()
    {
        return mrequestQueue;
    }
}
