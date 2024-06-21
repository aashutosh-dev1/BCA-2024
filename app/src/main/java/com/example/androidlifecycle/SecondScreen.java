package com.example.androidlifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondScreen extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_second_screen);


        Intent intent = getIntent();
        String receivedValue = intent.getStringExtra("bca");

        textView = findViewById(R.id.second_tv);

        textView.setText("Good Morning"+receivedValue);
    }
}