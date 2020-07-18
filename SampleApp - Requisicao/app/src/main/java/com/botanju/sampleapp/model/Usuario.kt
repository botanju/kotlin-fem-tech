package com.botanju.sampleapp.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Usuario (
    @SerializedName("id") val id: String,
    @SerializedName("name") val nome: String,
    @SerializedName("username") val apelido: String,
    @SerializedName("email") val email : String,
    @SerializedName("phone") val telefone : String,
    @SerializedName("website") val site : String
) : Serializable {

}
