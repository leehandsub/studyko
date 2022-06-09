package com.example.studyko.ui.common

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.studyko.AssetLoader
import com.example.studyko.network.ApiClient
import com.example.studyko.repository.category.CategoryRemoteDataSource
import com.example.studyko.repository.category.CategoryRepository
import com.example.studyko.repository.categorydetail.CategoryDetailRemoteDataSource
import com.example.studyko.repository.categorydetail.CategoryDetailRepository
import com.example.studyko.repository.home.HomeAssetDataSource
import com.example.studyko.repository.home.HomeRepository
import com.example.studyko.ui.category.CategoryViewModel
import com.example.studyko.ui.categorydetail.CategoryDetailViewModel
import com.example.studyko.ui.home.HomeViewModel

class ViewModelFactory(private val context: Context): ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return when {
            modelClass.isAssignableFrom(HomeViewModel::class.java) -> {
                val repository = HomeRepository(HomeAssetDataSource(AssetLoader(context)))
                HomeViewModel(repository) as T
            }
            modelClass.isAssignableFrom(CategoryViewModel::class.java) -> {
                val repository = CategoryRepository(CategoryRemoteDataSource(ApiClient.create()))
                CategoryViewModel(repository) as T
            }
            modelClass.isAssignableFrom(CategoryDetailViewModel::class.java) -> {
                val repository = CategoryDetailRepository(CategoryDetailRemoteDataSource(ApiClient.create()))
                CategoryDetailViewModel(repository) as T
            }
            else -> {
                throw IllegalArgumentException("Failed to create ViewModel: ${modelClass.name}")
            }
        }
    }
}