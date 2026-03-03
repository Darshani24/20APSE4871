fun main() {
    val numbers = listOf(10, -5, 4, -2, 7, 0, -1)
    var positiveSum = 0

    for (num in numbers) {
        
        if (num > 0) {
           
            positiveSum = positiveSum + num
        }
    }

    println("The sum of only positive numbers is: $positiveSum")
}