open class Animal {

    fun eat() {
        println("Animal is eating")
    }

    open fun sound() {
        println("Animal makes sound")
    }
}

class Dog : Animal() {

    override fun sound() {
        println("Dog barks")
    }
}

fun main() {

    val dog = Dog()

    dog.eat()
    dog.sound()
}