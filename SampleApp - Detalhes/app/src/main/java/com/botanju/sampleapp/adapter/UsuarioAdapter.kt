package com.botanju.sampleapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.botanju.sampleapp.R
import com.botanju.sampleapp.model.Usuario
import kotlinx.android.synthetic.main.item_lista_usuario.view.*

class UsuarioAdapter (private val list: List<Usuario>,
                      private val context: Context,
                      val clickListener: (Usuario, Int) -> Unit
) : RecyclerView.Adapter<UsuarioAdapter.UsuarioViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UsuarioViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_lista_usuario, parent, false)
        return UsuarioViewHolder(
            view
        )
    }

    override fun onBindViewHolder(holder: UsuarioViewHolder, position: Int) {
        val usuario = list[position]
        holder.bindView(usuario, clickListener, position)
    }

    override fun getItemCount(): Int {
        return list.size
    }


    class UsuarioViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {

        fun bindView(
            usuario: Usuario,
            clickListener: (Usuario, Int) -> Unit,
            position: Int
        ) {
            itemView.lbl_nome.text = "nome: ${usuario.nome}"
            itemView.lbl_email.text = "e-mail: ${usuario.email}"
            itemView.lbl_apelido.text = "apelido: ${usuario.apelido}"
            itemView.setOnClickListener({
                clickListener(usuario, position)
            })
        }

    }
}