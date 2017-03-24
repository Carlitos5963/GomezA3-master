package com.example.cisc.gomeza3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebViewMesa extends AppCompatActivity {

    public WebView webView;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view_mesa);


        webView = (WebView) findViewById(R.id.webViewMesa);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("http://www.sdmesa.edu");

    }

}