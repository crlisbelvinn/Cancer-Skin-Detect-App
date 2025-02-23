package com.dicoding.asclepius.news

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApiServices {
    @GET("top-headlines")
    fun searchHealthNews(
        @Query("q") query: String,
        @Query("category") category: String,
        @Query("language") language: String,
        @Query("apiKey") apiKey: String
    ): Call<NewsResponse>
}
