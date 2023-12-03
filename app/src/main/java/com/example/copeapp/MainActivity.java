package com.example.copeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button pillButton = findViewById(R.id.button_pill);
        Button horseButton = findViewById(R.id.button_horse);
        Button smokeButton = findViewById(R.id.button_smoke);
        Button sunButton = findViewById(R.id.button_sun);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);


//        BUTTON ON CLICK LISTENERS
        pillButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Pressed", Toast.LENGTH_SHORT).show();
            }
        });
        horseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Pressed", Toast.LENGTH_SHORT).show();
            }

        });
        smokeButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(MainActivity.this, "Pressed", Toast.LENGTH_SHORT).show();
            }
        });
        horseButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(MainActivity.this, "Pressed", Toast.LENGTH_SHORT).show();
            }
        });
        sunButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(MainActivity.this, "Pressed", Toast.LENGTH_SHORT).show();
            }
        });
        button6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(MainActivity.this, "Pressed", Toast.LENGTH_SHORT).show();
            }
        });
        button7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(MainActivity.this, "Pressed", Toast.LENGTH_SHORT).show();
            }
        });


    }
}