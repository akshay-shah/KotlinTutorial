fun main(args: Array<String>) {

    //Arrays

    var myArray = arrayOf(1, 3.2, false, "akshay", 'a') //multiple data types in a single array

    var partArray = myArray.copyOfRange(0, 3) //copies partial array from startIndex to endIndex

    println("Length of array = ${myArray.size}") //returns length of array

    println("Does it contain 3.2 = ${myArray.contains(3.2)}") //checks if it contains and returns true or false

    println("Return value at 3 index = ${myArray[3]}") // returns value at index

    println("Index of akshay is = ${myArray.indexOf("akshay")}") // returns index at value

    var squareArray = Array(5, { x -> x * x })
    println(squareArray[1])

    var intArray: Array<Int> = arrayOf(1, 2, 3)

    //Ranges

    var one2ten = 0..10
    var a2z = "A".."Z"

    println("4 in one2ten = ${4 in one2ten}")
    println("R in a2z = ${"R" in a2z}")

    var ten2one = 10.downTo(1) // way to assign reverse list

    for (x in one2ten) println("$x") //for loop

    for (x in one2ten.reversed()) println("$x") //reversed loop

}

/* Output
Length of array = 5
Does it contain 3.2 = true
Return value at 3 index = akshay
Index of akshay is = 3
1
4 in one2ten = true
R in a2z = true
0
1
2
3
4
5
6
7
8
9
10
10
9
8
7
6
5
4
3
2
1
0
 */