package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button toMainActivityButton = findViewById(R.id.GoBackToActivityOne);
        Button toThirdActivityButton = findViewById(R.id.GoNextToActivityThree);

        toMainActivityButton.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity2.this, MainActivity.class);
            startActivity(intent);
        });

        toThirdActivityButton.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity2.this,MainActivity3.class);
            startActivity(intent);
        });
    }
}

