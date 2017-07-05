package com.ihesen.kotlin

import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView.text = "这是一个Kotlin Android Demo"
        textView.textSize = 24.0f;
        textView.setTextColor(ContextCompat.getColor(this, android.R.color.holo_red_dark))
        textView.setOnClickListener {
            Toast.makeText(this, "这是一个Kotlin Android Demo", 0).show()
        }

        imageView.setBackgroundResource(R.mipmap.ic_launcher)
    }
}
