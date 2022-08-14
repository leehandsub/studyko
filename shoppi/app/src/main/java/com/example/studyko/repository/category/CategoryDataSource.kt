package com.example.studyko.repository.category

import com.example.studyko.model.Category

interface CategoryDataSource {

    suspend fun getCategories(): List<Category>
}