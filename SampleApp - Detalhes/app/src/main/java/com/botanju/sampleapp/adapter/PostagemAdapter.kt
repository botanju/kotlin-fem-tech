package com.botanju.sampleapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.botanju.sampleapp.R
import com.botanju.sampleapp.model.Postagem
import kotlinx.android.synthetic.main.item_lista_postaggem.view.*

class PostagemAdapter (private val list: List<Postagem>,
                       private val context: Context
) : RecyclerView.Adapter<PostagemAdapter.PostagemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostagemViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_lista_postaggem, parent, false)
        return PostagemViewHolder(
            view
        )
    }

    override fun onBindViewHolder(holder: PostagemViewHolder, position: Int) {
        val contato = list[position]
        holder.bindView(contato)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class PostagemViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {

        fun bindView(
            post: Postagem
        ) {
            itemView.lbl_titulo.text = "titulo: ${post.titulo}"
            itemView.lbl_conteudo.text = "conteudo: ${post.conteudo}"
        }

    }

}
