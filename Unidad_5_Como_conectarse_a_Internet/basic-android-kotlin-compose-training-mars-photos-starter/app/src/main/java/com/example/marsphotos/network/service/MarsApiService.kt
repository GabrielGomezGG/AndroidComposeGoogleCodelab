package com.example.marsphotos.network.service

import com.example.marsphotos.data.model.MarsPhoto
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

//private const val BASE_URL =
//    "https://android-kotlin-fun-mars-server.appspot.com"
//
//private val retrofit = Retrofit.Builder()
//    .baseUrl(BASE_URL)
//    .addConverterFactory(GsonConverterFactory.create())
//    .build()

interface MarsApiService {
    @GET("photos")
    suspend fun getPhotos(): List<MarsPhoto>
}