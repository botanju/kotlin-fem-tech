package com.botanju.sampleapp.activity

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.botanju.sampleapp.R
import com.botanju.sampleapp.model.Usuario
import com.botanju.sampleapp.service.RetrofitConfig
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ListaUsuariosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_usuarios)
        buscaUsuarios()
    }

    private fun buscaUsuarios() {

        val call = RetrofitConfig().apis().listarUsuarios()
        call.enqueue(object : Callback<List<Usuario>?> {
            override fun onResponse(
                call: Call<List<Usuario>?>?,
                response: Response<List<Usuario>?>?
            ) {

                response?.body()?.let {
                    var lista : List<Usuario> = it
                }
                Log.i("thefemtech", "lista retornada com sucesso")
            }

            override fun onFailure(
                call: Call<List<Usuario>?>?,
                t: Throwable?
            ) {
                Log.e("onFailure error", t?.message)
            }
        })

    }
}