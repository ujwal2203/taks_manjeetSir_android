package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity

class c_activity : ComponentActivity() {
    @Override
    protected override fun onCreate(savedInstanceState3 : Bundle?) {
        super.onCreate(savedInstanceState3)
        setContentView(R.layout.c_layout)
        val b3 = findViewById<Button>(R.id.button3_activity3)
        b3.setOnClickListener {
            val intent = Intent(this@c_activity, d_activity::class.java)
            startActivity(intent)
        }
    }
}