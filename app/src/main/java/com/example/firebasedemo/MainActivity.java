package com.example.firebasedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.*;
import android.view.*;

public class MainActivity extends AppCompatActivity {

    int clicks = 0;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        try {
            TextView text = findViewById(R.id.textDemo);
            text.setText("Button clicked " + ++clicks + " times");
        }
        catch(Exception e) {
            Log.d("Error", e.toString());
        }
    }
}