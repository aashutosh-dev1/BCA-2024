package com.example.androidlifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    Button myButton;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Assigning views to our variable to find the UI componenets
        myButton = findViewById(R.id.btn_navigate);
        editText = findViewById(R.id.et_tv);

        //Making button clickable
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Fetching the value of EDIT TEXT

                String typedValue = String.valueOf(editText.getText());


                // Navigation action
                Intent myIntent = new Intent(MainActivity.this, SecondScreen.class);
                myIntent.putExtra("bca",typedValue);
                startActivity(myIntent);

            }
        });

    }


}