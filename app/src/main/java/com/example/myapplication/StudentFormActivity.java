package com.example.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class StudentFormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_form);
        setTitle(R.string.title_student_form);
        InsetsHelper.applySystemBarPadding(findViewById(R.id.root));
    }
}
