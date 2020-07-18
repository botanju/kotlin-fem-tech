package com.botanju.sampleapp.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Postagem (
    @SerializedName("id") val id: Int,
    @SerializedName("userId") val userId: Int,
    @SerializedName("title") val titulo: String,
    @SerializedName("body") val conteudo : String
) : Serializable {

}