package com.example.ethyl.studentportal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        Intent intent = getIntent();
        Portal portal = intent.getParcelableExtra("portal");
        WebView webview = findViewById(R.id.webview);
        webview.loadUrl(portal.getmURLName());
    }
}
