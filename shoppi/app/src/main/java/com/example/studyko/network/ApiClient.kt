package com.example.studyko.network

import com.example.studyko.model.Category
import com.example.studyko.model.CategoryDetail
import com.example.studyko.model.Product
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiClient {

    @GET("categories.json")
    suspend fun getCategories() : List<Category>
    @GET("fashion_female.json")
    suspend fun getCategoryDetail(): CategoryDetail
    @GET("products/{productId}.json")
    suspend fun getProductDetail(@Path("productId") productId: String): Product
    companion object{

        private const val baseUrl = "https://shoppi-f9dfe-default-rtdb.asia-southeast1.firebasedatabase.app/"

        fun create():ApiClient{
            val logger = HttpLoggingInterceptor().apply {
                level = HttpLoggingInterceptor.Level.BASIC
            }

            val  client = OkHttpClient.Builder()
                .addInterceptor(logger)
                .build()
            return Retrofit.Builder()
                .baseUrl(baseUrl)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(ApiClient::class.java)
        }
    }

}