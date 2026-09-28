class Student(
    val name: String,
    val age: Int
) {

    fun displayDetails() {
        println("Name: $name")
        println("Age: $age")
    }
}

fun main() {

    val student = Student("Suki", 23)

    student.displayDetails()

    println(student.name)
    println(student.age)
}