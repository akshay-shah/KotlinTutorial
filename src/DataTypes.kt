fun main(args: Array<String>) {

    val name = "akshay" //immutable: cant be changed //type inference is used to understand the dataType
    var age = 27 //mutable : can be changed
    println("name = " + name) //way to write println
    println("age = $age") //way to write println using interpolation

    var bigInt: Int = Int.MAX_VALUE //way to initialize typed variables
    var smallInt: Int = Int.MIN_VALUE

    println("bigint = " + bigInt) //way to write println
    println("smallint = $smallInt")

    //Data Types
    var bigLong: Long = Long.MAX_VALUE
    var smallLong: Long = Long.MIN_VALUE

    println("bigLong = " + bigLong) //way to write println
    println("smallLong = $smallLong")

    var bigDouble: Double = Double.MAX_VALUE
    var smallDouble: Double = Double.MIN_VALUE

    println("bigDouble = " + bigDouble) //way to write println
    println("smallDouble = $smallDouble")

    var bigShort: Short = Short.MAX_VALUE
    var smallShort: Short = Short.MIN_VALUE

    println("bigShort = " + bigShort) //way to write println
    println("smallShort = $smallShort")

    var bigfloat: Float = Float.MAX_VALUE
    var smallFloat: Float = Float.MIN_VALUE

    println("bigFloat = " + bigfloat) //way to write println
    println("smallFloat = $smallFloat")

    var bigByte: Byte = Byte.MAX_VALUE
    var smallByte: Byte = Byte.MIN_VALUE

    println("bigByte = " + bigByte) //way to write println
    println("smallByte = $smallByte")

    var doubleNum1: Double = 1.1111111111111111
    var doubleNum2: Double = 1.1111111111111111

    println("Sum = " + (doubleNum1 + doubleNum2)) //precision error works only upto 15 digits after .

    //Boolean
    var checkStatus: Boolean = false
    if (checkStatus is Boolean) { // "is" is used to check the datatype
        println("checkstatus is boolean")
    }

    //Char
    var letterGrade: Char = 'a'
    println("A is charcter = ${letterGrade is Char}") //"{ }" use of curly brackets fetches the reult for the expression used
    println("A is charcter = ${1 + 1}") //here brackets return the sum of two numbers

    //Casting
    println("3.14 to Int = " + 3.14.toInt())
    println("A to Int = " + 'A'.toInt())
    println("65 to Char = " + 65.toChar())


}

/*
name = akshay
age = 27
bigint = 2147483647
smallint = -2147483648
bigLong = 9223372036854775807
smallLong = -9223372036854775808
bigDouble = 1.7976931348623157E308
smallDouble = 4.9E-324
bigShort = 32767
smallShort = -32768
bigFloat = 3.4028235E38
smallFloat = 1.4E-45
bigByte = 127
smallByte = -128
Sum = 2.2222222222222223
checkstatus is boolean
A is charcter = true
A is charcter = 2
3.14 to Int = 3
A to Int = 65
65 to Char = A
 */