package com.udacoding.wisataapi

import com.udacoding.wisataapi.model.Wisata
import retrofit2.Call
import retrofit2.http.GET

interface WisataService {


    @GET("?findAll")
    fun getWisata(
    ):Call<Wisata>
}