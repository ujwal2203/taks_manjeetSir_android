package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity

class b_activity : ComponentActivity() {
    protected override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.b_layout)
        val b2 = findViewById<Button>(R.id.button2_activity2)
        b2.setOnClickListener {
            val intent = Intent(this@b_activity, c_activity::class.java)
            startActivity(intent)
        }
    }
}