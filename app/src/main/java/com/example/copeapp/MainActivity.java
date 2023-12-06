package com.example.copeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.copeapp.profiles.CannabisProfile;
import com.example.copeapp.profiles.EcstasyProfile;
import com.example.copeapp.profiles.KetamineProfile;
import com.example.copeapp.profiles.LSDProfile;

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
                openEcstasyProfile();
            }
        });
        horseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Pressed", Toast.LENGTH_SHORT).show();
                openKetamineProfile();
            }

        });
        smokeButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(MainActivity.this, "Pressed", Toast.LENGTH_SHORT).show();
                openCannabisProfile();
            }
        });
        horseButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(MainActivity.this, "Pressed", Toast.LENGTH_SHORT).show();
                openKetamineProfile();
            }
        });
        sunButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(MainActivity.this, "Pressed", Toast.LENGTH_SHORT).show();
                openLSDProfile();
            }
        });
        button6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(MainActivity.this, "Under Construction", Toast.LENGTH_SHORT).show();
            }
        });
        button7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(MainActivity.this, "Under Construction", Toast.LENGTH_SHORT).show();
            }
        });
    }


    // Open Profile
    public void openEcstasyProfile(){
        Intent intent = new Intent(this, EcstasyProfile.class);
        startActivity(intent);
    }
    public void openCannabisProfile(){
        Intent intent = new Intent(this, CannabisProfile.class);
        startActivity(intent);
    }
    public void openLSDProfile(){
        Intent intent = new Intent(this, LSDProfile.class);
        startActivity(intent);
    }
    public void openKetamineProfile(){
        Intent intent = new Intent(this, KetamineProfile.class);
        startActivity(intent);
    }

}