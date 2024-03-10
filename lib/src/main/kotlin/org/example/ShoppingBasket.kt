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

    fun printItems(): String {
        val numberFormatter = DecimalFormat("£0.00")
        return _items.joinToString("\n") { item -> "${item.name.padEnd(16)}${numberFormatter.format(item.price)}" }
    }

    fun printBreakdown(): String {
        TODO("Not yet implemented")
    }
}
