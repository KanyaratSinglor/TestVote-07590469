package com.example.pretest1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Page3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);


        Intent intent = getIntent();

        final int score = intent.getIntExtra("S1", 0);
        TextView textView = findViewById(R.id.textViewScore);

        textView.setText(String.valueOf(score));


    }
}