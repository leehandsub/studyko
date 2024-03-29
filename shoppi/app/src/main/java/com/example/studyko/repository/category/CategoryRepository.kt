package com.example.studyko.repository.category

import com.example.studyko.model.Category

class CategoryRepository(
    private val remoteDataSource: CategoryRemoteDataSource
) {

    suspend fun getCategories(): List<Category> {
        return remoteDataSource.getCategories()
    }
}
