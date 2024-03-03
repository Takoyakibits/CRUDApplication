package com.mopal.crudapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Grandmaster extends AppCompatActivity {
    private Button sovereign;
    private Button challenger;
    private Button grandmaster;

    private Button guild;
    private Button lanes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grandmaster);

        challenger = findViewById(R.id.CHALLENGER);
        challenger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Grandmaster.this, Challenger.class);
                startActivity(intent);
            }
        });
        sovereign = findViewById(R.id.SOVEREIGN);
        sovereign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Grandmaster.this, leaderboard.class);
                startActivity(intent);
            }
        });
        guild = findViewById(R.id.GUILD);
        guild.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Grandmaster.this, Guild.class);
                startActivity(intent);
            }
        });

        lanes = findViewById(R.id.LANES);
        lanes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Grandmaster.this, Toplane.class);
                startActivity(intent);
            }
        });

    }
}
