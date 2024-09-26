package com.prak_pengembangan_app_mobile.pengembanganappmobile

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var mCount = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mShowCount = findViewById<TextView>(R.id.show_count)
        val buttonCountUp = findViewById<Button>(R.id.button_count)
        val buttonToast = findViewById<Button>(R.id.button_toast)
        val buttonSwitchPage = findViewById<Button>(R.id.button_switchpage)
        val buttonBrowser = findViewById<Button>(R.id.button_browser)

        buttonCountUp.setOnClickListener(View.OnClickListener {
            mCount++;
            if (mShowCount != null)
                mShowCount.text = mCount.toString()
        })

        buttonToast.setOnClickListener(View.OnClickListener {
            val tulisan: String = mShowCount?.text.toString()
            val toast: Toast = Toast.makeText(this, "Angka yang dimunculkan "+tulisan, Toast.LENGTH_LONG)
            toast.show()
        })

        buttonSwitchPage.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("MESSAGE", "Ada pesan dari MainActivity")
            startActivity(intent)
        })

        buttonBrowser.setOnClickListener(View.OnClickListener {
//            intent = Intent(Intent.ACTION_VIEW)
//            intent.setData(Uri.parse("https://www.google.com/"))
//            startActivity(intent)
            val gmmIntentUri = Uri.parse("geo:37.7749,-122.4194")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)
        })
    }
}