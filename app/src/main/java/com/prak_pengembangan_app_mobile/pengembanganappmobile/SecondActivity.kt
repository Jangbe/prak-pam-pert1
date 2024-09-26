package com.prak_pengembangan_app_mobile.pengembanganappmobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val message = intent.getStringExtra("MESSAGE").toString()
        val tv = findViewById<TextView>(R.id.text_header)
        tv.text = message
    }
}