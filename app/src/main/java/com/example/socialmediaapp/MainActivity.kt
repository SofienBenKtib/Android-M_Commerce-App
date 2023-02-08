package com.example.socialmediaapp

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.Toast
import androidx.core.view.isVisible
import kotlinx.coroutines.delay

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val email = findViewById<EditText>(R.id.email)
        val password = findViewById<EditText>(R.id.password)
        val loginButton = findViewById<Button>(R.id.login)
        val progressBar = findViewById<ProgressBar>(R.id.progressBar)
        val userName: String = "Sofien"
        val userPassword: String = "123abc"
        loginButton.setOnClickListener {
            //USERNAME AUTHENTIFICATION VERIFICATION
            if (email.text.toString().equals(userName) && password.text.toString().equals(userPassword) ) {
                Toast.makeText(this, "Welcome back $userName", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "Please enter a valid username", Toast.LENGTH_SHORT).show()
            }
            if (password.text.isEmpty()) {
                Toast.makeText(this, "Please enter a valid password", Toast.LENGTH_SHORT).show()
            } else {
                val handler = Handler()
                val runnable = Runnable {
                    progressBar.isVisible = true
                    loginButton.setBackgroundColor(Color.GREEN)
                    intent=Intent(this,Home::class.java)
                    startActivity(intent)
                }
                handler.postDelayed(runnable, 1500)
                progressBar.isVisible = false
                loginButton.setText("Please wait...")

            }
        }
    }
}