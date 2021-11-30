package com.example.projectlast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Webb extends AppCompatActivity {
    WebView webView1, webView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webb);

        webView2 = findViewById(R.id.web_view2);
        WebSettings webSettings2 = webView2.getSettings();
        webSettings2.setJavaScriptEnabled(true);
        Intent i = getIntent();
        String value1 = i.getStringExtra("key1");
        webView2.loadUrl(value1);
    }
}