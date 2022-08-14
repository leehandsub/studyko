package com.example.studyko.repository.productdetail

import com.example.studyko.model.Product
import com.example.studyko.network.ApiClient

class ProductDetailRemoteDataSource(
    private val api: ApiClient
) : ProductDetailDataSource {

    override suspend fun getProductDetail(productId: String): Product {
        return api.getProductDetail(productId)
    }
}