package com.botanju.sampleapp.activity

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.botanju.sampleapp.R
import com.botanju.sampleapp.adapter.PostagemAdapter
import com.botanju.sampleapp.model.Postagem
import com.botanju.sampleapp.model.Usuario
import com.botanju.sampleapp.service.RetrofitConfig
import kotlinx.android.synthetic.main.activity_lista_postagem.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PostagensActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_postagem)

        val usuario : Usuario = intent.extras.getSerializable("usuario") as Usuario

        buscaPostagem(usuario.id)
    }

    private fun buscaPostagem(userId: Int) {

        val call = RetrofitConfig().apis().listarPosts(userId)
        call.enqueue(object : Callback<List<Postagem>?> {
            override fun onResponse(
                call: Call<List<Postagem>?>,
                response: Response<List<Postagem>?>
            ) {

                response?.body()?.let {
                    var lista : List<Postagem> = it
                    exibeLista(lista)
                }
                Log.i("thefemtech", "lista de postagens retornada com sucesso")
            }

            override fun onFailure(
                call: Call<List<Postagem>?>?,
                t: Throwable?
            ) {
                Log.e("onFailure error", t?.message)
            }
        })

    }

    private fun exibeLista(lista: List<Postagem>){
        rv_postagens.adapter =
            PostagemAdapter(lista, this)

        val layoutManager = StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL)
        rv_postagens.layoutManager = layoutManager
    }

}
