package com.example.intellijplugin.utils

import java.io.IOException
import java.net.HttpURLConnection
import java.net.URL


@Suppress("UseExpressionBody")
fun testInternetConnection() {
    try {
        val url = URL("https://www.google.com")
        val urlConn = url.openConnection() as HttpURLConnection
        urlConn.connect()
        if (urlConn.responseCode == 200) {
            println("Connected to internet.")
        } else {
            println("Could not connect to internet.")
        }
        urlConn.disconnect()
    } catch (e: IOException) {
        println("Could not connect to internet: " + e.message)
    }
}