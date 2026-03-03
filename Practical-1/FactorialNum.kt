fun main() {
    val targetNumber = 5
    var result: Long = 1

    for (i in 1..targetNumber) {
        result = result * i
    }

    println("The factorial of $targetNumber is: $result")
}