fun main() {
    val originalList = listOf(1, 2, 2, 3, 4, 4, 4, 5)

    val uniqueList = mutableListOf<Int>()

    for (number in originalList) {
        
        if (!uniqueList.contains(number)) {
            
            uniqueList.add(number)
        }
    }

    println("Original: $originalList")
    println("Without duplicates: $uniqueList")
}