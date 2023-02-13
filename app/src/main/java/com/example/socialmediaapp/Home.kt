package com.example.socialmediaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val favorite=findViewById<ImageButton>(R.id.favorite)
        favorite.setOnClickListener{
            Toast.makeText(this,"Test works",Toast.LENGTH_LONG).show()
        }
    }
}