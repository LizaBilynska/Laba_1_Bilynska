package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonSpider = findViewById<Button>(R.id.button_spider)
        buttonSpider.setOnClickListener {
            SpiderIntent()
        }
        val buttonHippo = findViewById<Button>(R.id.button_hippo)
        buttonHippo.setOnClickListener {
            HippoIntent()
        }
        val buttonCrocodile = findViewById<Button>(R.id.button_crocodile)
        buttonCrocodile.setOnClickListener {
            CrocodileIntent()
        }
    }

    val Spider = Animal("Фрідріх", "Я павук під вашим ліжком.")
    val Hippo = Animal("Вальтер", "Я Бегемот, люблю фрукти.")
    val Crocodile = Animal("Алукард", "Я Крокодил, люблю маленьких дітей.")
    fun SpiderIntent() {
        val secActivity = Intent(this, ActivityInfo::class.java).also{
            it.putExtra("name", Spider.name)
            it.putExtra("about", Spider.about)
            startActivity(it)
        }
    }

    fun HippoIntent() {
        val secActivity = Intent(this, ActivityInfo::class.java).also{
            it.putExtra("name", Hippo.name)
            it.putExtra("about", Hippo.about)
            startActivity(it)
        }
    }

    fun CrocodileIntent() {
        val secActivity = Intent(this, ActivityInfo::class.java).also{
            it.putExtra("name", Crocodile.name)
            it.putExtra("about", Crocodile.about)
            startActivity(it)
        }
    }

}
data class Animal(val name: String, val about: String) {}