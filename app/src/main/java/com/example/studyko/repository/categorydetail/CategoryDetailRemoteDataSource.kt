package com.example.studyko.repository.categorydetail

import com.example.studyko.model.CategoryDetail
import com.example.studyko.network.ApiClient

class CategoryDetailRemoteDataSource(private val api: ApiClient) : CategoryDetailDataSource {

    override suspend fun getCategoryDetail(): CategoryDetail {
        return api.getCategoryDetail()
    }
}