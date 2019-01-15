package com.example.tafsir.baiust_lms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class academic extends AppCompatActivity {

    private Button cse,logout13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_academic);

        cse = (Button) findViewById(R.id.cse);
        logout13 = (Button) findViewById(R.id.logout12);


        cse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(academic.this,cse.class);
                startActivity(intent);
            }
        });


        logout13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(academic.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
