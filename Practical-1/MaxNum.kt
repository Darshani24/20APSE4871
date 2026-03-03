fun main() {

    val numbers = listOf(15, 42, 8, 91, 23, 64)
    var largest = numbers[0]

    for (num in numbers) {
        
        if (num > largest) {
            
            largest = num
        }
    }
    println("The largest number in the list is: $largest")
}