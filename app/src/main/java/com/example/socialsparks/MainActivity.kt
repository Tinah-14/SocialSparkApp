package com.example.socialsparks

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import java.util.Locale.getDefault

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val timeInput = findViewById<EditText>(R.id.timeInput)
        val suggestionText = findViewById<TextView>(R.id.suggestionText)
        val submitButton = findViewById<Button>(R.id.submitButton)
        val resetButton = findViewById<Button>(R.id.resetButton)

        submitButton.setOnClickListener {
            val input = timeInput.text.toString().lowercase(getDefault())

            if (input.contains("morning")) {
                suggestionText.text = "Good morning! Have a great day!"
            } else if (input.contains("afternoon")) {
                suggestionText.text = "Check on a colleague or a friend and have a quick chat."
            } else if (input.contains("evening")) {
                suggestionText.text = "Call a family member to invite them over for dinner."
            } else if (input.contains("night")) {
                suggestionText.text = "Sorry, That doesn't have a spark. Try comforting words, You can do it!"

            resetButton.setOnClickListener {
                timeInput.text.clear()
                suggestionText.text = "Your Spark will appear here!"

            }
        }
        }
    }
}