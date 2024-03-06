package com.mopal.crudapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.mopal.crudapplication.R;

public class Midlane extends AppCompatActivity {
    private Button Toplane;
    private Button Jungle;

    private Button Midlane;

    private Button Botlane;

    private Button Support;

    private Button Rank;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_midlane);

        Jungle = findViewById(R.id.JUNGLE);
        Jungle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Midlane.this, Jungle.class);
                startActivity(intent);
            }
        });

        Toplane = findViewById(R.id.TOP);
        Toplane.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Midlane.this, Toplane.class);
                startActivity(intent);
            }
        });

        Botlane = findViewById(R.id.BOTTOM);
        Botlane.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Midlane.this, Bottomlane.class);
                startActivity(intent);
            }
        });

        Support = findViewById(R.id.SUPPORT);
        Support.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Midlane.this, Support.class);
                startActivity(intent);
            }
        });

        Rank = findViewById(R.id.RANK);
        Rank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Midlane.this, leaderboard.class);
                startActivity(intent);
            }
        });
    }
}