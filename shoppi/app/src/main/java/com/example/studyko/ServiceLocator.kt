package com.example.studyko

import android.content.Context
import androidx.room.Room
import com.example.studyko.database.AppDatabase
import com.example.studyko.network.ApiClient
import com.example.studyko.repository.cart.CartItemLocalDataSource
import com.example.studyko.repository.cart.CartRepository

object ServiceLocator {

    private var apiClient: ApiClient? = null
    private var database: AppDatabase? = null
    private var cartRepository: CartRepository? = null

    fun provideApiClient(): ApiClient {
        return apiClient ?: kotlin.run {
            ApiClient.create().also {
                apiClient = it
            }
        }
    }

    private fun provideDatabase(applicationContext: Context): AppDatabase {
        return database ?: kotlin.run {
            Room.databaseBuilder(
                applicationContext,
                AppDatabase::class.java,
                "shoppi-local"
            ).build().also {
                database = it
            }
        }
    }

    fun provideCartRepository(context: Context): CartRepository {
        return cartRepository ?: kotlin.run {
            val dao = provideDatabase(context.applicationContext).cartItemDao()
            CartRepository(CartItemLocalDataSource(dao)).also {
                cartRepository = it
            }
        }
    }
}