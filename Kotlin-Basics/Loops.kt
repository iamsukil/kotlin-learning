fun main() {

    // for loop
    for (i in 1..5) {
        println(i)
    }

    // while loop
    var count = 1

    while (count <= 5) {
        println("Count: $count")
        count++
    }

    // do while
    var number = 1

    do {
        println("Number: $number")
        number++
    } while (number <= 3)

    // break
    for (i in 1..10) {
        if (i == 6) {
            break
        }
        println(i)
    }

    // continue
    for (i in 1..5) {
        if (i == 3) {
            continue
        }
        println(i)
    }
}