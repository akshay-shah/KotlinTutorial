import java.util.*

fun main(args: Array<String>) {
    //Conditional and Logical Operators

    val age = 8                                         //if else if conditions in kotlin
    if (age < 5) {
        println("U shud go to nursery")
    } else if (age >= 5 && age <= 8) {
        println("U shud go to primary")
    } else if (age > 8 && age <= 16) {
        println("u shud go to high school")
    } else {
        println("u shud go to college")
    }

    when (age) { //when or switch
        0, 1, 2, 3, 4 -> println("U shud go to nursery")
        5, 6, 7, 8 -> println("U shud go to primary")
        in 9..16 -> println("u shud go to high school")
        else -> println("u shud go to college")
    }

    //Looping

    for (x in 1..10) {                                  //for loop
        println("loop $x")
    }

    val rand = Random()
    val magicNumber = rand.nextInt(50) + 1
    var guess = 0
    while (magicNumber != guess) {                      //while loop
        guess += 1
    }
    println("MagicNum : $magicNumber Guess : $guess")


    for (x in 1..20) {
        if (x % 2 == 0) {
            continue                                    //continue loops from start
        }

        println("Odd : $x")

        if (x == 15) {
            break                                       //exits the for loop
        }
    }

    var arrayInt: Array<Int> = arrayOf(3, 6, 9)
    for (i in arrayInt.indices) {                       //returns values
        println("Multiples of 3 : ${arrayInt[i]}")
    }
    for ((index, value) in arrayInt.withIndex()) {      //returns values with indices
        println("Index $index Value $value")
    }


}

/* Output
U shud go to primary
U shud go to primary
loop 1
loop 2
loop 3
loop 4
loop 5
loop 6
loop 7
loop 8
loop 9
loop 10
MagicNum : 20 Guess : 20
Odd : 1
Odd : 3
Odd : 5
Odd : 7
Odd : 9
Odd : 11
Odd : 13
Odd : 15
Multiples of 3 : 3
Multiples of 3 : 6
Multiples of 3 : 9
Index 0 Value 3
Index 1 Value 6
Index 2 Value 9
 */