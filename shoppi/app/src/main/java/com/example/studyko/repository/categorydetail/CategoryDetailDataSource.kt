package com.example.studyko.repository.categorydetail

import com.example.studyko.model.CategoryDetail

interface CategoryDetailDataSource {

    suspend fun getCategoryDetail(): CategoryDetail
}