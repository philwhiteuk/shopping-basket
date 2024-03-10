package org.example

import java.text.DecimalFormat

class ShoppingBasket(items: List<Item> = listOf()) {
    private val _items: MutableList<Item> = items.toMutableList()

    val items: List<Item>
        get() {
            return _items
        }

    fun addItem(item: Item) {
        _items.add(item)
    }

    fun removeItem(name: String) {
        _items.removeIf { item -> item.name == name }
    }

    private val numberFormatter = DecimalFormat("£0.00")

    fun printItems(): String {
        return _items.joinToString("\n") { item -> "${item.name.padEnd(16)}${numberFormatter.format(item.price)}" }
    }

    fun printBreakdown(): String {
        val sum = _items.map { item -> item.price }.reduce { sum, price -> sum + price }
        return """
            Amount          ${numberFormatter.format(sum)}
            
            Sub-total       ${numberFormatter.format(sum)}
            VAT             £0.00
            Balance         ${numberFormatter.format(sum)}
            """.trimIndent()
    }
}
