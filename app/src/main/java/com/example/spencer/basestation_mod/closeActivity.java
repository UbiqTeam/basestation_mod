package com.example.spencer.basestation_mod;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class closeActivity extends AppCompatActivity {

    public void openSpaces(View view){
        Intent openSpace = new Intent(this, openActivity.class);
        startActivity(openSpace);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_close);

        WebView myWebView = (WebView) findViewById(R.id.webview);
        myWebView.setWebViewClient(new WebViewClient());
        myWebView.loadUrl("http://72.204.69.115:96/L");
    }
}
