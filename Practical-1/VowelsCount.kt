fun main() {
    val mySentence = "Hello, I am learning Kotlin"
    var vowelCount = 0

    val lowerSentence = mySentence.lowercase()

    for (letter in lowerSentence) {
        
        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
            vowelCount++ 
        }
    }

    println("The number of vowels is: $vowelCount")
}