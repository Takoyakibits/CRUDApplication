package com.mopal.crudapplication;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.sql.Connection;
import java.sql.Statement;

public class DeleteOperation {

    private Button btndelete;
    private EditText idEditText;

    public DeleteOperation(Button btndelete, EditText idEditText) {
        this.btndelete = btndelete;
        this.idEditText = idEditText;

        this.btndelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deleteOperation();
            }
        });
    }

    private void deleteOperation() {
        Connection connection = connectionclass();
        try {
            if (connection != null) {
                String idValue = idEditText.getText().toString();
                String sqldelete = "DELETE FROM YourTableName WHERE id = '" + idValue + "'";
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
        // Implement your connection logic here
        return null;
    }
}
