package com.botanju.sampleapp.activity

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.botanju.sampleapp.R
import com.botanju.sampleapp.adapter.UsuarioAdapter
import com.botanju.sampleapp.model.Usuario
import com.botanju.sampleapp.service.RetrofitConfig
import kotlinx.android.synthetic.main.activity_lista_usuarios.*
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
                    exibeLista(lista)
                }
                Log.i("thefemtech", "lista de usuarios retornada com sucesso")
            }

            override fun onFailure(
                call: Call<List<Usuario>?>?,
                t: Throwable?
            ) {
                Log.e("onFailure error", t?.message)
            }
        })

    }

    private fun exibeLista(lista : List<Usuario>){
        rv_usuarios.adapter =
            UsuarioAdapter(lista, this,
                { item: Usuario, position: Int ->
                    Log.i("ListaUsuarios", "Clicked on item  ${item.nome} at position $position")
                    abrirPost(item)
                })

        val layoutManager = StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL)
        rv_usuarios.layoutManager = layoutManager
    }

    private fun abrirPost(usuario: Usuario){

    }
}