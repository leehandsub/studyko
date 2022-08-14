package com.example.studyko.repository.category

import com.example.studyko.model.Category
import com.example.studyko.network.ApiClient


class CategoryRemoteDataSource(private val apiClient: ApiClient): CategoryDataSource {

    override suspend fun getCategories(): List<Category> {
        return apiClient.getCategories()
    }
}