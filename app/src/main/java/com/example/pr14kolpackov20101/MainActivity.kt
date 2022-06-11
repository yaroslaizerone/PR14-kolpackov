package com.example.pr14kolpackov20101

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    private lateinit var btn2 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn2 = findViewById(R.id.btn2)
        btn2.setOnClickListener{
            val intent = Intent(this,menu::class.java)
            startActivity(intent)}
    }
}