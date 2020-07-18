package com.botanju.sampleapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        botao_entrar.setOnClickListener({
            val intent = Intent(this, ListaUsuariosActivity::class.java).apply{}
            startActivity(intent)
        })
    }
}
