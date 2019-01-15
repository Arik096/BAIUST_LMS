package com.example.tafsir.baiust_lms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class secondActivity extends AppCompatActivity {

    private Button nonAcademic,academic,developer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        Button logout = (Button) findViewById(R.id.button2);
        academic = (Button) findViewById(R.id.button3);
        nonAcademic = (Button) findViewById(R.id.button4);
        developer=(Button)findViewById(R.id.Dev);



        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(secondActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });



        academic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(secondActivity.this,academic.class);
                startActivity(intent);
            }
        });


        nonAcademic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(secondActivity.this,nonAc.class);
                startActivity(intent);
            }
        });

        developer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(secondActivity.this,developer.class);
                startActivity(intent);
            }
        });
    }
}
