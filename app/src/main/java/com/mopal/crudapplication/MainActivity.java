package com.mopal.crudapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MainActivity extends AppCompatActivity {

    ConSQL conSQL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        conSQL = new ConSQL();

        Button executeQueryButton = findViewById(R.id.button);
        executeQueryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        Connection connection = conSQL.conclass();
                        if (connection != null) {
                            try {
                                String query = "SELECT * FROM YourTableName";
                                try (PreparedStatement statement = connection.prepareStatement(query);
                                     ResultSet resultSet = statement.executeQuery()) {

                                    while (resultSet.next()) {
                                        // Process the result set here
                                    }
                                } catch (SQLException e) {
                                    e.printStackTrace();
                                } finally {
                                    try {
                                        connection.close();
                                    } catch (SQLException e) {
                                        e.printStackTrace();
                                    }
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }).start();
            }
        });
    }

    public void openLeaderboard(View view) {
        Intent intent = new Intent(this, leaderboard.class);
        startActivity(intent);
        finish();
    }
}
