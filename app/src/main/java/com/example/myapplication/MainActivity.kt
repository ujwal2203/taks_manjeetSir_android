package com.example.myapplication


import android.R.id.button1
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Button
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.a_layout)
        val b1 = findViewById<Button>(R.id.button1_activity1)
        b1.setOnClickListener {
            val intent = Intent(this@MainActivity, b_activity::class.java)
            startActivity(intent)
        }

        onBackPressedDispatcher.addCallback(this) {
            Log.d("Main activity", "pressed the back navigation button")
            finishAffinity()
        }
    }
}

