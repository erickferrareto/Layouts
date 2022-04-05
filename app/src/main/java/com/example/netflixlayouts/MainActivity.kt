package com.example.netflixlayouts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botao = findViewById<Button>(R.id.button)
        botao.setOnClickListener{
            proximaTela()
        }
    }

    fun proximaTela(){
        val intent = Intent(this, InterfaceNetflix::class.java)
        startActivity(intent)
    }
}