package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Button toMainActivityButton = findViewById(R.id.GoBackToActivityOne);

        toMainActivityButton.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity3.this, MainActivity.class);
            startActivity(intent);
        });
    }
}