

fun main(args: Array<String>) {
    //Functions

    /**
     * Addition function with return type specified
     */
    fun add(num1: Int, num2: Int): Int = num1 + num2

    /**
     * Addition function with default values
     */
    fun addOtherWay(num1: Int = 1, num2: Int = 2): Int = num1 + num2

    /**
     * Subtraction function with no return type
     */
    fun subtract(num1: Int, num2: Int) = num1 - num2

    /**
     * SayHello function with return type unit
     * unit means void
     */
    fun sayHello(name: String): Unit = println("Hello $name")                  //

    println("sum = ${add(4, 5)}")
    println("subtract = ${subtract(5, 4)}")
    println("subtract other way = ${subtract(num2 = 5, num1 = 4)}")
    sayHello("Akshay")

    // takes a pair directly
    var (two, three) = nextTwo(1)
    println("1,$two,$three")

    println("Sum of 1 to 5 = ${getSum(1,2,3,4,5)}")

    val multiply = {num1 :Int,num2:Int -> num1*num2}

    println("Multiply = ${multiply(2,3)}")

    println("5! = ${fact(5)}")

}

/**
 * nextTwo function returns two value or a pair of values
 */
fun nextTwo(num: Int): Pair<Int, Int> {
    return Pair(num + 1, num + 2)
}

/**
 * takes input as an integer array vararg is varaible arguments
 */
fun getSum(vararg nums : Int): Int{
    var sum = 0
    nums.forEach { n -> sum += n } //foreach is used to loop thru the array nums
    return sum
}

/**
 * tailrec stands for tail recursive function in Kotlin
 * this function takes int argument and returns factorial for the same
 */
fun fact(x:Int) : Int{
    tailrec fun factTail(y:Int,z:Int) : Int{
        if (y==0) return z
        else return factTail(y-1,y*z)
    }
    return factTail(x,1)
}

/* output
sum = 9
subtract = 1
subtract other way = -1
Hello Akshay
1,2,3
Sum of 1 to 5 = 15
Multiply = 6
5! = 120
 */