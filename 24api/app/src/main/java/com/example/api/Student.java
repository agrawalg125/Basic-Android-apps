package com.example.api;

import androidx.annotation.StringDef;

import com.google.gson.annotations.SerializedName;

public class Student {

    private String name;
    private String email;
    @SerializedName("course_count")
    private  int course_count;

    public Student(String name, String email, int course_count) {
        this.name = name;
        this.email = email;
        this.course_count = course_count;
    }
}
