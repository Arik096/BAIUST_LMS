package com.example.tafsir.baiust_lms;



import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    DatabaseHelper databaseHelper;

    private EditText userName;
    private EditText password;
    private Button button,signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        databaseHelper=new DatabaseHelper(this);
        SQLiteDatabase sqLiteDatabase=databaseHelper.getWritableDatabase();


        userName =(EditText) findViewById(R.id.userNameId);
        password =(EditText) findViewById(R.id.passwordId);
        button =(Button) findViewById(R.id.buttonId);
        signup =(Button) findViewById(R.id.buttonsignn);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final String Username=userName.getText().toString();
                final String Password=password.getText().toString();

                Boolean result;

                ///Toast.makeText(MainActivity.this, ""+Username, Toast.LENGTH_SHORT).show();
                result = databaseHelper.findPassword(Username,Password);

                if(result == true)
                {
                    Intent intent=new Intent(MainActivity.this,secondActivity.class);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"username or password did not matched",Toast.LENGTH_LONG).show();
                }

            }
        });


        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,signup.class);
                startActivity(intent);
            }
        });



    }

}
