

fun main(args: Array<String>) {
    //Higher Order Functions

    val numList = 1..20
    val evenList = numList.filter { it % 2 == 0 } //this basically filters a given list with ur filteration defined in "it"
    evenList.forEach { n -> println(n) }

    var multiply = makeMathFunc(3) //This creates multiply with makeMathFunc
    println("5 * 3 = ${multiply(5)}") //pass num2 value to it through multiply

    var divide = makeDivideFunction(10)
    println("10 / 5= ${divide(5)}")

    val myArray = arrayOf(1,2,3,4,5)
    MathOnList(myArray,multiply)

    val myList = 1..20
    val reduceList = myList.reduce{x,y -> x+y} //starts with initial x =1
    val foldList = myList.fold(10){x,y->x+y} //starts with initial x = 10

    println("ReduceList : $reduceList FoldList :$foldList")

    println("Does contain even numbers = ${myList.any { it % 2 == 0 }}") // checks a particular condition on given list return true if any of the element meets the condition
    println("Are all value even = ${myList.all { it % 2 == 0 }}") //checks a particular condition on every element returns true only if all elements meet the condition

    val newList = myList.map{it * multiply(5)} //passing a function to map to get results multiplied by our function "multiply"
    newList.forEach{n -> println("*3 : $n")}
}

/**
 * This function creates another function which has return type int and takes in parameter num2
 */
fun makeMathFunc(num1: Int): (Int) -> Int = { num2 -> num1 * num2 }

/**
 * same as above with division
 */
fun makeDivideFunction(num1: Int): (Int) -> Int = { num2 -> num1 / num2 }

/**
 * This function basically takes in arguments as Int array and a function
 */
fun MathOnList(numList : Array<Int>,myFunc :(num:Int)->Int){
    for(num in numList){
        println("MathOnlist = ${myFunc(num)}")
    }
}

/* Output
2
4
6
8
10
12
14
16
18
20
5 * 3 = 15
10 / 5= 2
MathOnlist = 3
MathOnlist = 6
MathOnlist = 9
MathOnlist = 12
MathOnlist = 15
ReduceList : 210 FoldList :220
Does contain even numbers = true
Are all value even = false
*3 : 15
*3 : 30
*3 : 45
*3 : 60
*3 : 75
*3 : 90
*3 : 105
*3 : 120
*3 : 135
*3 : 150
*3 : 165
*3 : 180
*3 : 195
*3 : 210
*3 : 225
*3 : 240
*3 : 255
*3 : 270
*3 : 285
*3 : 300
 */