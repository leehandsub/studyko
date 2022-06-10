package com.example.studyko.repository.cart

import com.example.studyko.database.CartItemDao
import com.example.studyko.model.CartItem

class CartItemLocalDataSource(
    private val dao: CartItemDao
) : CartItemDataSource {

    override suspend fun addCartItem(cartItem: CartItem) {
        dao.insert(cartItem)
    }

    override suspend fun getCartItems(): List<CartItem> {
        return dao.load()
    }
}