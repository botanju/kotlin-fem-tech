package com.botanju.sampleapp.service

import com.botanju.sampleapp.model.Usuario
import retrofit2.Call
import retrofit2.http.GET

interface Apis {

    @GET("users")
    fun listarUsuarios(): Call<List<Usuario>>

}