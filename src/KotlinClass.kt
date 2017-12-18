fun main(args: Array<String>){
    val donkey = Animal("Donkey",10.0,20.0)
    donkey.getInfo()
    println(donkey.height)
    println(donkey.name)
    println(donkey.weight)
    donkey.getInfo()
    val chotu = Dog("Chotu",5.5,9.09,"Chota Rajan")
    chotu.getInfo()
}

open class Animal(val name : String,val height : Double,val weight :Double){
    init {
        require(name!= "raju"){throw IllegalArgumentException("name cannot be raju")}
        require(height!= 0.0){throw IllegalArgumentException("height cannot be zero")}
        require(weight!=0.0){throw IllegalArgumentException("weight cannot be zero")}
    }

    open fun getInfo() : String{
        return "$name is $height tall and weighs $weight"
    }
}

class Dog(name: String,height: Double,weight: Double,val owner :String) : Animal(name, height, weight){
    override fun getInfo() : String {
        return "$name is $height tall and weighs $weight and owned by $owner"
    }
}

