package com.example.tafsir.baiust_lms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cse extends AppCompatActivity {

    private Button l3t2,logoutCSE,l1t1,l1t2,l2t1,l2t2,l3t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse);


        l3t2 = (Button) findViewById(R.id.level32);
        l1t1 = (Button) findViewById(R.id.level11);
        l1t2 = (Button) findViewById(R.id.level12);
        l3t1 = (Button) findViewById(R.id.level31);
        l2t2 = (Button) findViewById(R.id.level22);
        l2t1 = (Button) findViewById(R.id.level21);

        logoutCSE = (Button) findViewById(R.id.logoutcse);

        logoutCSE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cse.this,MainActivity.class);
                startActivity(intent);
            }
        });

        l3t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cse.this,l3t2.class);
                startActivity(intent);
            }
        });
        l3t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cse.this,l3t1.class);
                startActivity(intent);
            }
        });
        l1t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cse.this,l1t1.class);
                startActivity(intent);
            }
        });
        l1t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cse.this,l1t1.class);
                startActivity(intent);
            }
        });
        l2t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cse.this,l2t1.class);
                startActivity(intent);
            }
        });
        l2t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cse.this,l2t2.class);
                startActivity(intent);
            }
        });


    }
}
