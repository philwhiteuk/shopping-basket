package org.example

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
        TODO("Not yet implemented")
    }

    fun printBreakdown(): String {
        TODO("Not yet implemented")
    }
}
