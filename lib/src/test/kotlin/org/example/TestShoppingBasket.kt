package org.example

import kotlin.test.Test
import kotlin.test.assertTrue

class TestShoppingBasket {
    @Test
    fun addItems() {
        val basket = ShoppingBasket()

        val apple = Item("apple", 0.2, null)
        basket.addItem(apple)
        assertTrue(basket.items.size == 1, "there should be an apple in the basket")
    }
}
