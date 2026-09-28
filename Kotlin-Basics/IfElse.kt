fun main() {

    val age = 23

    if (age >= 18) {
        println("Eligible")
    } else {
        println("Not eligible")
    }

    val marks = 75

    if (marks >= 90) {
        println("Grade A")
    } else if (marks >= 75) {
        println("Grade B")
    } else if (marks >= 50) {
        println("Grade C")
    } else {
        println("Fail")
    }

    val result = if (age >= 18) "Adult" else "Minor"

    println(result)
}