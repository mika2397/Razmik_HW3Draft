package com.example.razmik_hw3.Results

import com.example.razmik_hw3.DataClasses.newsData
import com.example.razmik_hw3.newsResources.News
import retrofit2.http.GET
import retrofit2.http.Query


interface NewsApiService {
//    fun fetchNews(@Query("country") country: String?): newsData {
//        @GET("news")
//        suspend fun getNews(): List<newsData>
//    }
    @GET("news")
    suspend fun getNews(): List<News>
}