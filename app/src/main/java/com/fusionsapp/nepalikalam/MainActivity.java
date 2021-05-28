package com.fusionsapp.nepalikalam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private long backPressedTime ;
    WebView webView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView = (WebView) findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.nepalikalam.com/login");
    }

    @Override
    public void onBackPressed() {

        if(backPressedTime + 2000 > System.currentTimeMillis()){
            super.onBackPressed();
            return;
        }else {
            Toast.makeText(getBaseContext(),"Press Back Again To Exit", Toast.LENGTH_SHORT).show();
        }

        backPressedTime = System.currentTimeMillis();
    }
}