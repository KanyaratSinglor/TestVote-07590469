package com.example.pretest1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int answer = 10;
    int score = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button guessButton = findViewById(R.id.guessbutton);


        final EditText textBox = (EditText) findViewById(R.id.editTextNumber);

        guessButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                System.out.println("Hello");
//
//                Context context = getApplicationContext();
//                CharSequence text = "Hello toast!";
//                int duration = Toast.LENGTH_SHORT;
//
//                Toast toast = Toast.makeText(context, text, duration);
//                toast.show();

                String msg = textBox.getEditableText().toString();
                int n = Integer.parseInt(msg);
                Context context = getApplicationContext();
                int duration = Toast.LENGTH_SHORT;
                CharSequence text = null;
                int socre = 0;

                if(n < 10){
//                    System.out.println("ผิด มีค่าน้อยไป");

                     text = "ผิด มีค่าน้อยไป";
                }
                else if(n == 10){
                    score++;
//                    System.out.println("ถูกต้อง");

                    text = "ถูกต้อง";
                }
                else{
//                    System.out.println("ผิด มีค่ามากไป");

                    text = "ผิด มีค่ามากไป";
                }
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

                System.out.println(score);
//                System.out.println(msg);

            }

        });
        Button exitButton = findViewById(R.id.exitButton);
        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                System.out.println("Goodbye");

                Context context =getApplicationContext();
                CharSequence text = "Goodbye toast!";
                int duration = Toast.LENGTH_LONG;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

                System.exit(0);
            }
        });
//-----------------------------
        Button scoreButton = findViewById(R.id.ScoreButton);

         scoreButton.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {

//                 AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
//                 dialog.setTitle(R.string.titleDialog);
//                 dialog.setMessage(R.string.msgDialog);
                 dialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                     @Override
                     public void onClick(DialogInterface dialogInterface, int i) {
                         //finish();
                         //System.exit(0);
                     }
                 });
                 dialog.setNegativeButton("No", null);
                 dialog.show();
                 Intent intent = new Intent(MainActivity.this, SecoundActivity.class);
                 intent.putExtra("Score", score);
                 startActivity(intent);

             }
         });

    }
}