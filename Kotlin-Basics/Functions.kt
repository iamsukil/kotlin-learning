fun greet() {
    println("Hello Sukil")
}

fun greetPerson(name: String) {
    println("Hello $name")
}

fun add(a: Int, b: Int): Int {
    return a + b
}

fun multiply(a: Int, b: Int) = a * b

fun introduce(name: String, city: String = "Chennai") {
    println("Name: $name")
    println("City: $city")
}

fun main() {

    greet()

    greetPerson("Sukil")

    val result = add(10, 20)
    println("Addition: $result")

    println("Multiplication: ${multiply(5, 4)}")

    introduce("Sukil")
    introduce(name = "Sukil", city = "Chennai")
}