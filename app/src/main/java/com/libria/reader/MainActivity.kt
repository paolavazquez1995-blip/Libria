package com.libria.reader

import android.app.Activity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import android.content.Intent

class MainActivity : Activity() {
    private lateinit var web: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        web = WebView(this)
        web.settings.javaScriptEnabled = true
        web.settings.domStorageEnabled = true
        web.webChromeClient = WebChromeClient()
        web.webViewClient = WebViewClient()
        setContentView(web)
        web.loadUrl("file:///android_asset/index.html")
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
    }
}
