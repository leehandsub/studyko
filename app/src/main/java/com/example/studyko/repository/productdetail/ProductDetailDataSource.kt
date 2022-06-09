package com.example.studyko.repository.productdetail

import com.example.studyko.model.Product

interface ProductDetailDataSource {

    suspend fun getProductDetail(productId: String): Product

}