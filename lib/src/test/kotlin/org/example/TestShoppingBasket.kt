package org.example

import kotlin.test.Test
import kotlin.test.assertContains
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class TestShoppingBasket {
    @Test
    fun addItems() {
        val basket = ShoppingBasket()

        val apple = Item("apple", 0.2)
        basket.addItem(apple)
        assertTrue(basket.items.size == 1, "there should be an apple in the basket")

        val orange = Item("orange", 0.5)
        basket.addItem(orange)
        assertContains(basket.items, orange, "there should be an orange in the basket")
    }

    @Test
    fun removeItems() {
        val basket =
            ShoppingBasket(
                listOf(Item("apple", 0.2)),
            )

        assertTrue(basket.items.size == 1, "there should be an apple in the basket")

        basket.removeItem("apple")
        assertTrue(basket.items.isEmpty(), "there should be nothing left in the basket")
    }

    @Test
    fun printItems() {
        val basket =
            ShoppingBasket(
                listOf(
                    Item("apple", 0.2),
                    Item("orange", 0.5),
                ),
            )

        assertEquals(
            """
            apple           £0.20
            orange          £0.50
            """.trimIndent(),
            basket.printItems(),
        )
    }

    @Test
    fun printBreakdownOfPrices() {
        val basket =
            ShoppingBasket(
                listOf(
                    Item("apple", 0.2),
                    Item("orange", 0.5),
                ),
            )

        assertEquals(
            """
            Amount          £0.70
            
            Sub-total       £0.70
            VAT             £0.00
            Balance         £0.70
            """.trimIndent(),
            basket.printBreakdown(),
        )
    }
}
