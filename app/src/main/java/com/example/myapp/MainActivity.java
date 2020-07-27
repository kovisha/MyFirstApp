package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button myFirstButton = findViewById(R.id.btnHello);

        myFirstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myFirstButton.setText("Hungry");
            }
        });
    }
}