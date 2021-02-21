package com.example.myapplication2222

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        webVIew()
    }


    private fun webVIew() {
        val shwapnoWeb : WebView = findViewById(R.id.web_id)
        shwapnoWeb.webViewClient = WebViewClient()
        shwapnoWeb.apply {
            loadUrl("https://reofood.com.bd/")
            settings.javaScriptEnabled = true
            settings.allowContentAccess = true


        }
    }
}