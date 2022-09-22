package com.example.android_09_22;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;

import java.util.Locale;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout rl;
    private EditText input;
    private Button button1;
    private Button button2;
    private Button button3;
    private EditText output;
    private String inputtext;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputtext = (String) button1.getText();
                String uppercase = inputtext.toUpperCase();
                output.setText(uppercase);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputtext = (String) button1.getText();
                String lowercase = inputtext.toLowerCase();
                output.setText(lowercase);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rnd = new Random();
                output.setBackgroundColor(Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));
            }
        });

    }

    private void init()
    {
        input = findViewById(R.id.input);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        output = findViewById(R.id.output);
        rl = findViewById(R.id.rl);
        inputtext = (String) button1.getText();
    }
}