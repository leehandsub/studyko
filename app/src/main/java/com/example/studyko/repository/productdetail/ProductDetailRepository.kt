package com.example.studyko.repository.productdetail

import com.example.studyko.model.Product

class ProductDetailRepository(
    private val remoteDataSource: ProductDetailDataSource
) {

    suspend fun getProductDetail(productId: String): Product {
        return remoteDataSource.getProductDetail(productId)
    }
}