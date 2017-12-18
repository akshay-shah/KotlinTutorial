fun main(args : Array<String>){
    //Exception Handling
    val divisor = 5
    try {
        if(divisor==0){
            throw IllegalArgumentException("Cant divide by zero")
        }else{
            println("10 / $divisor = ${10/divisor}")
        }
    }catch (e :IllegalArgumentException){
        e.printStackTrace()
        println(e.message)
    }
}