package Interfaces

fun main(args: Array<String>) {
    var dog = Animal("Dog", 12, "bark")
    var cat = Animal("Cat", 5, "meoww")
    println("Dog noise : " + dog.sound)
    println("Cat noise : " + cat.sound)
}