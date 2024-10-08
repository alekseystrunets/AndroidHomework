package com.example.lesson_16

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    private lateinit var nextButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        nextButton = findViewById(R.id.nextButton1)

        nextButton.setOnClickListener {
            val intent3 = Intent(this, ThirdActivity::class.java)
            startActivity(intent3)

        }
    }
}

