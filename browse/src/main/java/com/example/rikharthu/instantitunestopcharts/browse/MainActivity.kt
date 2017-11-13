package com.example.rikharthu.instantitunestopcharts.browse

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val data = this.intent.data
        val limit = data.getQueryParameter("limit")?.toInt() ?: 10
        Log.d("MainActivity", "limit = $limit")

        val a = 4
    }
}