package com.example.myfirstapp

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);

        val btnGoToRNPage = findViewById<Button>(R.id.simpleButton)
        btnGoToRNPage.setOnClickListener {
            startRNPage();
        }
    }

    private fun startRNPage() {
        val intent = Intent(this, ReactNativeActivity::class.java)
        startActivity(intent)
        finish()
    }
}