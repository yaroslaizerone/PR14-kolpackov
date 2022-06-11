package com.example.pr14kolpackov20101

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class menu : AppCompatActivity() {
    private lateinit var bt1 : Button
    private lateinit var bt2 : Button
    private lateinit var bt3 : Button
    private lateinit var bt4 : Button
    private lateinit var bt5 : Button
    private lateinit var bt6 : ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        bt1 = findViewById(R.id.bt1)
        bt2 = findViewById(R.id.bt2)
        bt3 = findViewById(R.id.bt3)
        bt4 = findViewById(R.id.bt4)
        bt5 = findViewById(R.id.bt5)
        bt6 = findViewById(R.id.imageButton)
        bt1.setOnClickListener{
            val intent = Intent(this,soup::class.java)
            startActivity(intent)}
        bt2.setOnClickListener{
            val intent = Intent(this,Salad::class.java)
            startActivity(intent)}
        bt3.setOnClickListener{
            val intent = Intent(this,pancakes::class.java)
            startActivity(intent)}
        bt4.setOnClickListener{
            val intent = Intent(this,milkshake::class.java)
            startActivity(intent)}
        bt5.setOnClickListener{
            val intent = Intent(this,pasta::class.java)
            startActivity(intent)}
        bt6.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)}
    }
}