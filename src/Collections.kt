fun main(args: Array<String>) {
    //List

    var myList: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5) //mutable or changeable list
    val newList: List<Int> = listOf(1, 2, 3) //immutable or final list

    myList.add(6)
    myList.add(6, 7)

    var subList = myList.subList(0, 5)
    println("1st element = ${myList.first()}")
    println("Last element = ${myList.last()}")
    println("Length = ${myList.size}")
    println("Sublist Length = ${subList.size}")
    myList.forEach { n -> println("Mutable List $n") }
    myList.clear()

    //Maps

    var map : MutableMap<Int,Any?> = mutableMapOf(1 to "Doug",2 to "Akshay")

    for((x,y) in map){
        println("Key : $x Value : $y")
    }
    map.remove(2)
    map.clear()
    map[1] = true
    map[2] = false

    for((x,y) in map){
        println("Key : $x Value : $y")
    }

    var mapOfAnimal : MutableMap<Int,Animal> = mutableMapOf(1 to Dog("baburao",6.6,7.8,"rizwan"))
    for((x,y) in mapOfAnimal){
        println("Key : $x Value : ${y.getInfo()}")
    }



}