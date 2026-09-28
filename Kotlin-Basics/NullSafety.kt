fun main() {

    var name: String? = "Sukil"

    println(name)

    println(name?.length)

    name = null

    println(name?.length)

    val length = name?.length ?: 0

    println("Length: $length")

    val city: String? = "Chennai"

    println(city!!.length)
}