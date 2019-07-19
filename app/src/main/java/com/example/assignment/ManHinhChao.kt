package com.example.assignment

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import java.util.Timer
import java.util.TimerTask

class ManHinhChao : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_man_hinh_chao)
        var context: Context? = null;

        val timer = Timer()
        timer.schedule(object : TimerTask() {
            override fun run() {
                val intent = Intent(this@ManHinhChao, MainActivity::class.java)
                startActivity(intent)
            }
        }, 5000)
    }
}
