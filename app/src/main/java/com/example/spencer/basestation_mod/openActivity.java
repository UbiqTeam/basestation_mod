package com.example.spencer.basestation_mod;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class openActivity extends AppCompatActivity {


    public void closeSpaces(View view){
        Intent closeSpace = new Intent(this, closeActivity.class);
        startActivity(closeSpace);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open);

        WebView myWebView = (WebView) findViewById(R.id.webview);
        myWebView.setWebViewClient(new WebViewClient());
        myWebView.loadUrl("http://72.204.69.115:96/H");
    }
}
