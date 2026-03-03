fun main() {
   
    val myNumbers = listOf(1, 2, 3, 4, 5, 6)
    var totalSum = 0

    for (item in myNumbers) {
        
        if (item % 2 == 0) {
            totalSum = totalSum + item
        }
    }
    println("The total sum of even numbers is: $totalSum")
}