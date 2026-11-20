package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        InsetsHelper.applySystemBarPadding(findViewById(R.id.root));

        // Design only: the Login button just opens the Student Form screen.
        Button btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(v ->
                startActivity(new Intent(this, StudentFormActivity.class)));
    }
}
