package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ActivityInfo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)
        showInfo()
    }

    fun showInfo()
    {
        val name = intent.getStringExtra("name")
        val about = intent.getStringExtra("about")
        val showName = findViewById<TextView>(R.id.textNameofAnimal).apply {
            text = name
        }
        val showAbout = findViewById<TextView>(R.id.textAboutAnimal).apply {
            text = about
        }
    }
}