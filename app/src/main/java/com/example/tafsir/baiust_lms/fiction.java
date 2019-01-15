package com.example.tafsir.baiust_lms;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;

public class fiction extends AppCompatActivity {
    private Button book1,book2,book3,book4;
    WebView mWebView;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fiction);


        book1 = (Button) findViewById(R.id.book_1);
        book2 = (Button) findViewById(R.id.book_2);
        book3 = (Button) findViewById(R.id.book_3);
        book4 = (Button) findViewById(R.id.book_4);





       book1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               mWebView = (WebView) findViewById(R.id.simpleWebView);

               WebSettings webSettings = mWebView.getSettings();
               webSettings.setJavaScriptEnabled(true);

               mWebView.loadUrl("file:///android_asset/Beingmoral.html");


           }
       });

        book2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mWebView = (WebView) findViewById(R.id.simpleWebView);

                WebSettings webSettings = mWebView.getSettings();
                webSettings.setJavaScriptEnabled(true);

                mWebView.loadUrl("file:///android_asset/7spirits.html");


            }
        });

        book3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mWebView = (WebView) findViewById(R.id.simpleWebView);

                WebSettings webSettings = mWebView.getSettings();
                webSettings.setJavaScriptEnabled(true);

                mWebView.loadUrl("file:///android_asset/giveandtake.html");


            }
        });

        book4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mWebView = (WebView) findViewById(R.id.simpleWebView);

                WebSettings webSettings = mWebView.getSettings();
                webSettings.setJavaScriptEnabled(true);

                mWebView.loadUrl("file:///android_asset/ourstar.html");


            }
        });


    }







}
