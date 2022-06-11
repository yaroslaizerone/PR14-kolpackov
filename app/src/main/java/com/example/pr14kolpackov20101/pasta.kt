package com.example.pr14kolpackov20101

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class pasta : AppCompatActivity() {
    private lateinit var bt6 : ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pasta)
        bt6 = findViewById(R.id.imageButton)
        bt6.setOnClickListener{
            val intent = Intent(this,menu::class.java)
            startActivity(intent)}
}}