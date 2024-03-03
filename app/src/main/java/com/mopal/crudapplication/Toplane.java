package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Toplane extends AppCompatActivity {

    private Button Toplane;
    private Button Jungle;

    private Button Midlane;

    private Button Botlane;

    private Button Support;

    private Button Rank;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toplane);

        Jungle = findViewById(R.id.JUNGLE);
        Jungle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Toplane.this, Jungle.class);
                startActivity(intent);
            }
        });

        Midlane = findViewById(R.id.MID);
        Midlane.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Toplane.this, Midlane.class);
                startActivity(intent);
            }
        });

        Botlane = findViewById(R.id.BOTTOM);
        Botlane.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Toplane.this, Bottomlane.class);
                startActivity(intent);
            }
        });

        Support = findViewById(R.id.SUPPORT);
        Support.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Toplane.this, Support.class);
                startActivity(intent);
            }
        });

        Rank = findViewById(R.id.RANK);
        Rank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Toplane.this, leaderboard.class);
                startActivity(intent);
            }
        });



    }
}