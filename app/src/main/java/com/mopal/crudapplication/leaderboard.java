package com.mopal.crudapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class leaderboard extends AppCompatActivity {

    private Button sovereign;
    private Button challenger;
    private Button grandmaster;
    private Button rank;
    private Button lanes;
    private Button guild;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leaderboard);

        challenger = findViewById(R.id.CHALLENGER);
        challenger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(leaderboard.this, Challenger.class);
                startActivity(intent);
            }
        });
        grandmaster = findViewById(R.id.GRANDMASTER);
        grandmaster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(leaderboard.this, Grandmaster.class);
                startActivity(intent);
            }
        });

        guild = findViewById(R.id.GUILD);
        guild.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(leaderboard.this, Guild.class);
                startActivity(intent);
            }
        });
        lanes = findViewById(R.id.LANES);
        lanes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(leaderboard.this, Toplane.class);
                startActivity(intent);
            }
        });

    }
}





