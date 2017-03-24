package com.example.cisc.gomeza3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebViewYahoo extends AppCompatActivity {

    public WebView webView;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view_yahoo);

        webView = (WebView) findViewById(R.id.webViewYahoo);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("http://www.yahoo.com");

    }

}