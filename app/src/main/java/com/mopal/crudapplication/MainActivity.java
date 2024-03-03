package com.mopal.crudapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    // declare everything as another activity in androidmanifest
    // fix onclick methods both in xml code and in java code
    // connect to sql

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openLeaderboard(View view) {
        Intent intent = new Intent(this, leaderboard.class);
        startActivity(intent);
        finish();
    }
}
