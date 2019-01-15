package com.example.tafsir.baiust_lms;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.widget.Toast.makeText;

public class signup extends AppCompatActivity implements View.OnClickListener {


    private EditText id,name,email,username,password;
    private Button submit;
    UserDetails userDetails;
    DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        name = (EditText) findViewById(R.id.Name);
        email = (EditText) findViewById(R.id.Email);
        username = (EditText) findViewById(R.id.Username);
        password = (EditText) findViewById(R.id.Password);



        submit = (Button) findViewById(R.id.sign);

        databaseHelper = new DatabaseHelper(this);
        userDetails = new UserDetails();

        submit.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        String Name = name.getText().toString();
        String Email = email.getText().toString();
        String UserName = username.getText().toString();
        String Password = password.getText().toString();

        userDetails.setName(Name);
        userDetails.setEmail(Email);
        userDetails.setUsername(UserName);
        userDetails.setPassword(Password);

        long rowId = databaseHelper.insertData(Name,Email,UserName,Password);


        if(rowId>0)
        {
            Toast.makeText(getApplicationContext(),"Row "+rowId+" is successfully Inserted",Toast.LENGTH_LONG ).show();
        }

        else
        {
            Toast.makeText(getApplicationContext(),"Row insertion Failed !",Toast.LENGTH_LONG).show();
        }


    }
}
