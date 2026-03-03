fun main() {
    val secretNumber = 7
    var userGuess = 0

    println("I'm thinking of a number between 1 and 10.")

    while (userGuess != secretNumber) {
        
        print("Enter your guess: ")
    
        val input = readln()
        userGuess = input.toInt()

        if (userGuess != secretNumber) {
            println("Wrong! Try again.")
        }
    }
    println("Congratulations! You guessed it.")
}