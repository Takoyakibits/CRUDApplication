package com.mopal.crudapplication;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CreateOperation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_operation);

        // Assuming your button ID is CREATE
        Button createButton = findViewById(R.id.CREATE);
        createButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Call the appropriate create operation based on your requirements
                createOperationRank();
            }
        });
    }

    // logic for rank-specific input
    public void createOperationRank() {
        TextView gameID = findViewById(R.id.gameIdText);
        TextView ign = findViewById(R.id.ignText);
        TextView points = findViewById(R.id.pointsText);
        TextView leaderboard = findViewById(R.id.LbText);
        TextView rank = findViewById(R.id.rankText);

        Connection connection = connectionclass();
        try {
            if (connection != null) {
                // Use PreparedStatement to avoid SQL injection
                String sqlCreate = "INSERT INTO " + rank.getText().toString() + "Rank VALUES (?, ?, ?, ?)";
                try (PreparedStatement preparedStatement = connection.prepareStatement(sqlCreate)) {
                    // Set values for the parameters
                    preparedStatement.setString(1, gameID.getText().toString());
                    preparedStatement.setString(2, ign.getText().toString());
                    preparedStatement.setInt(3, Integer.parseInt(points.getText().toString()));
                    preparedStatement.setString(4, leaderboard.getText().toString());

                    // Execute the update
                    int rowsAffected = preparedStatement.executeUpdate();

                    if (rowsAffected > 0) {
                        Log.i("CreateOperation", "Insert successful");
                    } else {
                        Log.e("CreateOperation", "Insert failed");
                    }
                }
            }
        } catch (Exception exception) {
            Log.e("CreateOperation", exception.getMessage());
        }
    }

    // Replace this with your connection logic from ConSQL
    private Connection connectionclass() {
        // Implement your connection logic here
        return null;
    }
}