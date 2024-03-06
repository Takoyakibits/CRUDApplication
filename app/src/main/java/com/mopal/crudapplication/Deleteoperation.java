package com.example.test;

import android.view.View;
import android.widget.Button;

public class Deleteoperation {


    Button btndelete =findViewById(R.id.DELETE);


    btndelete.setOnClickListener(new View.OnClickListener()){

        public void onClick(View v){
            Connection connection = connectionclass();
            try{
                if (connection != null) {
                    String sqldelete ="Delete Userinfo" + id.getText().toString() +"'";
                    Statement st = connection.createStatement();
                    ResultSet rs = st.executeQuery(sqldelete);
                }

            }catch (Exception exception){
                Log.e("Error", exception.getMessage());
            }
        }
    }

}
