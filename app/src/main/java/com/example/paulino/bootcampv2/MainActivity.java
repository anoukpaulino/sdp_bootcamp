package com.example.paulino.bootcampv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText name;
    Button startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText) findViewById(R.id.mainGetName);
        startButton = (Button) findViewById(R.id.mainStartButton);

        startButton.setOnClickListener(this);
    }

    public void onClick(View view) {
        Intent intent = new Intent(this, GreetingActivity.class);
        intent.putExtra("name", name.getText().toString());
        startActivity(intent);
    }
}