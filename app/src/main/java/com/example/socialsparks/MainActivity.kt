package com.example.socialsparks

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsComp

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        val timeInput = findViewById<EditText>(R.id.timeInput)
        val suggestionText = findViewById<TextView>(R.id.suggestionText)
        val submitButton = findViewById<Button>(R.id.submitButton)
        val resetButton = findViewById<Button>(R.id.resetButton)

        submitButton.setOnClickListener {
            val input = timeInput.text.toString().toLowerCase()

            if (input.contains("morning")) {
                suggestionText.text = "Good morning! Have a great day!"
            } else if (input.contains("afternoon")) {
                suggestionText.text = "Check on a colleague or a friend and have a quick chat."
            } else if (input.contains("evening")) {
                suggestionText.text = "Call a family member to invite them over for dinner."
            } else"
                suggestionText.text = "Sorry, That doesn't have a spark. Try comforting words, You can do it!"

            resetButton.setOnClickListener {
                timeInput.text.clear()
                suggestionText.text = "Your Spark will appear here!"

            }
        }
        }
    }
}