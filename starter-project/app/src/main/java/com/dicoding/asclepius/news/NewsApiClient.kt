package com.dicoding.asclepius.news

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object NewsApiClient {
    private val retrofit = Retrofit.Builder()
        .baseUrl(NewsApiConfig.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val newsApiServices: NewsApiServices = retrofit.create(NewsApiServices::class.java)
}