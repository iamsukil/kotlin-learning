fun main() {

    // List - read only
    val names = listOf("Sukil", "Arun", "Kumar")

    println(names)
    println(names[0])

    for (name in names) {
        println(name)
    }

    // MutableList
    val cities = mutableListOf("Chennai", "Coimbatore")

    cities.add("Madurai")

    println(cities)

    // Set - does not allow duplicates
    val numbers = setOf(10, 20, 20, 30)

    println(numbers)

    // Map - key and value
    val students = mapOf(
        1 to "Sukil",
        2 to "Arun",
        3 to "Kumar"
    )

    println(students)
    println(students[1])

    for ((id, name) in students) {
        println("$id -> $name")
    }
}