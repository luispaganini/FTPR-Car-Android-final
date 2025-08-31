package com.example.myapitest.data.remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
//    private const val BASE_URL = "http://192.168.0.195:3000/"
    private const val BASE_URL = "http://10.0.2.2:3000/"

    val instance: CarApiService by lazy {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        retrofit.create(CarApiService::class.java)
    }
}