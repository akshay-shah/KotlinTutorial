fun main(args: Array<String>) {


//    var nullValue : String = null  this is not allowed
    var nullValue: String? = null //adding a "?" allows null



    //    fun nullFunc(): String{
    //        return null
    //    }
    fun nullFunc(): String? { // adding ? operator allows returning null
        return null
    }

    var nullValue2 = nullFunc()

    if (nullValue2 == null){
        println("Null value2 : $nullValue")
    }

    var nullValue3 : String = nullFunc() ?: "no name" //checks if null returns no name as value

    println("Null Value3 : $nullValue3")
}