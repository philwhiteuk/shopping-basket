package org.example

import kotlin.test.Ignore
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class AcceptanceTest {
    @Test @Ignore
    fun addSomeItemsRemovesOneAndListsPrices() {
        testShoppingBasket { basket ->
            basket.addSomeItems()
            assertTrue(basket.itemCount() == 7)
            basket.removeOne()
            assertEquals(
                """
                ----------------------
                Apples          £0.80
                Oranges         £1.02
                Cola Can        £1.00
                Ice Cream       £1.99
                Bread           £2.80
                Fruit Cake      £4.99
                ----------------------
                Amount          £12.60
                
                Sub-total       £11.73
                VAT             £ 0.87
                Balance         £12.60
                """.trimIndent(),
                basket.listPrices(),
            )
        }
    }

    class TestShoppingBasket {
        val groceryItems =
            mapOf(
                "Bananas" to mapOf("price" to 3.5),
                "Apples" to mapOf("price" to 0.8),
                "Oranges" to mapOf("price" to 1.02),
                "Cola Can" to mapOf("price" to 1.0, "taxPct" to 0.2),
                "Ice Cream" to mapOf("price" to 1.99, "taxPct" to 0.2),
                "Bread" to mapOf("price" to 2.8, "taxPct" to 0.05),
                "Fruit Cake" to mapOf("price" to 4.99, "taxPct" to 0.05),
            )

        fun addSomeItems() {
            TODO("Not yet implemented")
        }

        fun itemCount(): Int {
            TODO("Not yet implemented")
        }

        fun removeOne() {
            TODO("Not yet implemented")
        }

        fun listPrices(): String {
            TODO("Not yet implemented")
        }
    }

    private fun testShoppingBasket(function: (basket: TestShoppingBasket) -> Unit) {
        val basket = TestShoppingBasket()
        function(basket)
    }
}
