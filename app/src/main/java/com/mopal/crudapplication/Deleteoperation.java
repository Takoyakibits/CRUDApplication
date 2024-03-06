package com.mopal.crudapplication;

import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DeleteOperation {

    private Button btndelete;

    public DeleteOperation(Button btndelete) {
        this.btndelete = btndelete;

        this.btndelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deleteOperation();
            }
        });
    }

    // Logic for delete operation
    private void deleteOperation() {
        Connection connection = connectionclass();
        try {
            if (connection != null) {

                String sqldelete = "DELETE id = '" + id.getText().toString() + "'";
                try (Statement st = connection.createStatement()) {
                    int rowsAffected = st.executeUpdate(sqldelete);

                    if (rowsAffected > 0) {
                        Log.i("DeleteOperation", "Delete successful");
                    } else {
                        Log.e("DeleteOperation", "Delete failed. Record not found.");
                    }
                }
            }
        } catch (Exception exception) {
            Log.e("DeleteOperation", exception.getMessage());
        }
    }

    private Connection connectionclass() {

        return null;
    }
}