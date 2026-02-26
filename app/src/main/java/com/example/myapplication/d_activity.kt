package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity

class d_activity : ComponentActivity() {
    protected override fun onCreate(savedInstanceState4 : Bundle?) {
        super.onCreate(savedInstanceState4)
        setContentView(R.layout.d_layout)
        val b4 = findViewById<Button>(R.id.button4_activity4)
        b4.setOnClickListener {
            val intent = Intent(this@d_activity, MainActivity::class.java)
            startActivity(intent)
        }
    }
}