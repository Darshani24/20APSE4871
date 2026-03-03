fun main() {
    val fruits = listOf("Apple", "Banana", "Cherry", "Date")
    val reversedFruits = mutableListOf<String>()
    val lastIndex = fruits.size - 1

    for (i in lastIndex downTo 0) {
        
        val item = fruits[i]
        reversedFruits.add(item)
    }

    println("Original: $fruits")
    println("Reversed: $reversedFruits")
}