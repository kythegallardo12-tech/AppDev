package com.example.myapplication;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class StudentFormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_form);
        setTitle(R.string.title_student_form);
        InsetsHelper.applySystemBarPadding(findViewById(R.id.root));

        // Show the back arrow (←) in the title bar
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        // Back button: return to the previous page (Login)
        Button btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(v -> finish());
    }

    // Back arrow (←) in the title bar: return to the previous page (Login)
    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
