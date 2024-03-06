package com.example.createoperation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

public class CreateOperation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_operation);
        Button createButton = (Button) findViewById(R.id.CREATE);


    }


    // logic for rank-specific input
    public void createOperationRank() {
        TextView gameID = (TextView) findViewById(R.id.gameIdText);
        TextView ign = (TextView) findViewById(R.id.ignText);
        TextView points = (TextView) findViewById(R.id.pointsText);
        TextView leaderboard = (TextView) findViewById(R.id.LbText);
        TextView rank = (TextView) findViewById(R.id.rankText);

        Connection connection = connectionclass();
        try {
            if (Connection != null) {
                String sqlCreate = "INSERT INTO "+ rank.getText().toString()+"Rank values ('"+gameID.getText().toString()+"', '"+ign.getText().toString()+"', "+points.getText().toString()+", "+leaderboard.getText().toString()+");";
                Statement st = connection.createStatement();
                ResultSet rs =st.executeQuery(sqlCreate);
            }
        } catch (Exception exception) {
            Log.e("Error",exception.getMessage());
        }
        return con;
    }

}