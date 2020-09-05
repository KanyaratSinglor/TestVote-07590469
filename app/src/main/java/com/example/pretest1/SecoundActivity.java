package com.example.pretest1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecoundActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secound);
        Intent intent = getIntent();

        final int score = intent.getIntExtra("Score", -1);
        TextView textView = findViewById(R.id.textViewScore);

        textView.setText(score+"");


        final Button page3Button = findViewById(R.id.nextbutton);
        page3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(SecoundActivity.this, Page3.class);
                intent1.putExtra("S1", score);
                startActivity(intent1);
            }
        });

    }
}