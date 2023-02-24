package com.example.paulino.bootcampv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class GreetingActivity extends AppCompatActivity {
    TextView greeting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greeting);

        greeting = (TextView) findViewById(R.id.textGreeting);

        Intent intent = getIntent();

        String name = intent.getStringExtra("name");
        greeting.setText("Welcome to the Bootcamp, " + name);
    }
}