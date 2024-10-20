package com.example.lesson_17

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class FirstScreen : AppCompatActivity() {
    private lateinit var nextButton : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_screen)
        nextButton = findViewById(R.id.nextButton)
        nextButton.setOnClickListener {
            val intent2 = Intent(this, SecondScreen::class.java)
            startActivity(intent2)
        }
        }
    }
