package com.example.marsphotos.data

import com.example.marsphotos.network.service.MarsApiService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

interface AppContainer {
    val marsPhotosRepository : MarsPhotosRepository
}

class DefaultAppContainer : AppContainer {

    private val BASE_URL =
        "https://android-kotlin-fun-mars-server.appspot.com"

    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(MarsApiService::class.java)

//    private val retrofitService: MarsApiService by lazy {
//        retrofit.create(MarsApiService::class.java)
//    }
    override val marsPhotosRepository: MarsPhotosRepository by lazy {
        DefaultMarsPhotosRepository(retrofit)
    }

}