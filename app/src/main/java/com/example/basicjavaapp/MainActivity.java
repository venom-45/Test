package com.example.basicjavaapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView message = findViewById(R.id.message);
        Button button = findViewById(R.id.button);

        button.setOnClickListener(v -> message.setText("Hello from Java! 🎉"));
    }
}
