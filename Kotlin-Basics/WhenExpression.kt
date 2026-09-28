fun main() {

    val day = 3

    when (day) {
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        else -> println("Weekend")
    }

    val mark = 85

    val grade = when {
        mark >= 90 -> "A"
        mark >= 75 -> "B"
        mark >= 50 -> "C"
        else -> "Fail"
    }

    println("Grade: $grade")
}