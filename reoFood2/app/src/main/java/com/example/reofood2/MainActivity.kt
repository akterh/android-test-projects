package com.example.reofood2

import android.os.Bundle
import android.util.Log
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout


class MainActivity : AppCompatActivity() {
    var mySwipeRefreshLayout: SwipeRefreshLayout? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        objReoWeb()
    }

    private fun objReoWeb() {
        val reoWeb : WebView = findViewById(R.id.reo_web)
        reoWeb.webViewClient = WebViewClient()
        reoWeb.apply {
            loadUrl("https://technofelia.com")

            settings.javaScriptEnabled = true
            settings.allowContentAccess = true


        }

        mySwipeRefreshLayout = findViewById(R.id.swiperefresh)

        mySwipeRefreshLayout?.setOnRefreshListener {
            Log.i("on refresh", "onRefresh called from SwipeRefreshLayout")

            // This method performs the actual data-refresh operation.
            // The method calls setRefreshing(false) when it's finished.
            reoWeb?.reload();

        }
       


    }

}