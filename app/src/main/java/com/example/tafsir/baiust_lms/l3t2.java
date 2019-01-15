package com.example.tafsir.baiust_lms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;

public class l3t2 extends AppCompatActivity {

    private Button as,dsd,na,se,dc;
    WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_l3t2);


        as = (Button) findViewById(R.id.as);
        dsd = (Button) findViewById(R.id.dsd);
        na = (Button) findViewById(R.id.na);
        se = (Button) findViewById(R.id.se);
        dc=(Button)findViewById(R.id.dc);


        as.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mWebView = (WebView) findViewById(R.id.simpleWebView);

                WebSettings webSettings = mWebView.getSettings();
                webSettings.setJavaScriptEnabled(true);

                mWebView.loadUrl("file:///android_asset/AS.html");


            }
        });


        dc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mWebView = (WebView) findViewById(R.id.simpleWebView);

                WebSettings webSettings = mWebView.getSettings();
                webSettings.setJavaScriptEnabled(true);

                mWebView.loadUrl("file:///android_asset/DSD.html");


            }
        });

        dsd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mWebView = (WebView) findViewById(R.id.simpleWebView);

                WebSettings webSettings = mWebView.getSettings();
                webSettings.setJavaScriptEnabled(true);

                mWebView.loadUrl("file:///android_asset/DC.html");


            }
        });

        na.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mWebView = (WebView) findViewById(R.id.simpleWebView);

                WebSettings webSettings = mWebView.getSettings();
                webSettings.setJavaScriptEnabled(true);

                mWebView.loadUrl("file:///android_asset/NA.html");


            }
        });


        se.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mWebView = (WebView) findViewById(R.id.simpleWebView);

                WebSettings webSettings = mWebView.getSettings();
                webSettings.setJavaScriptEnabled(true);

                mWebView.loadUrl("file:///android_asset/SE.html");


            }
        });





    }
}
