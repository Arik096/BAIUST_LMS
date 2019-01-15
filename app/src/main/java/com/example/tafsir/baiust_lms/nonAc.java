package com.example.tafsir.baiust_lms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class nonAc extends AppCompatActivity {

    private Button logout1,fiction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_non);


        logout1= (Button) findViewById(R.id.logout1);
        fiction= (Button) findViewById(R.id.fiction);


        logout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(nonAc.this,MainActivity.class);
                startActivity(intent);
            }
        });


        fiction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(nonAc.this,fiction.class);
                startActivity(intent);
            }
        });

    }
}
