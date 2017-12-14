fun main(args : Array<String>){

    //Strings

    var stringName = "akshay"
    var stringName2 = "Akshay"
    var stringLastName = "shah"
    var stringFullName = stringName + stringLastName

    println("Length of FullName = ${stringFullName.length}")

    println("Compare func = ${stringName.compareTo(stringName2)}") //Compare returns the difference if it is not equal else returns 0

    println("Equal func = ${stringName.equals(stringName2)}") //Equals will return boolean value true or false

    println("String index func = ${stringName[2]}") //will return char at index 2

    println("Substring func = ${stringFullName.subSequence(2,8)}") //returns substring from startIndex to endIndex

    println("Contains func = ${stringFullName.contains("akshay")}") //check if string contains my given regex




}

/* Output
Length of FullName = 10
Compare func = 32
Equal func = false
String index func = s
Substring func = shaysh
Contains func = true
 */