interface Vehicle {

    fun start()
}

class Car : Vehicle {

    override fun start() {
        println("Car started")
    }
}

class Bike : Vehicle {

    override fun start() {
        println("Bike started")
    }
}

fun main() {

    val car = Car()
    car.start()

    val bike = Bike()
    bike.start()
}