package com.jota.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

private lateinit var bttVolver : Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        bttVolver = findViewById(R.id.bttVolver)

        bttVolver.setOnClickListener {
            finish()
        }
    }
}