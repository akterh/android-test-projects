package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.myapplication.R.id.shwapno_web

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        webView()
    }
    @SuppressLint("WrongViewCast")
    private fun webView() {
        val Shwapnoweb: WebView = findViewById(R.id.shwapno_web)
        Shwapnoweb.webViewClient = WebViewClient()
        Shwapnoweb.apply{
            loadUrl ("https://www.shwapno.com/")

        }
    }
}