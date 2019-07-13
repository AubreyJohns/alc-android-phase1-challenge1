package com.example.alc4_phase1_android_challenge1;

import android.net.http.SslError;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class aboutALC extends AppCompatActivity {
    WebView webView;
    private static final String TAG = "aboutAlC";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);

        webView=(WebView) findViewById(R.id.webview);

        webView.setWebViewClient(new WvClient());
        webView.loadUrl("https://andela.com/alc");
        WebSettings webSettings=webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
    private class WvClient extends WebViewClient
    {
        @Override
        public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError er) {
            handler.proceed();
            // Ignore SSL certificate errors
        }
    }
    @Override
    public void onBackPressed(){
        if(webView.canGoBack()){
            webView.goBack();
        }
    }
}
