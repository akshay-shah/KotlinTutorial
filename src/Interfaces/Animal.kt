package Interfaces

open class Animal(val name: String, var age:Int,var sound : String) : MakesSound{
    override fun makeNoise(): String {
        return sound
    }

    init {
        this.age = age
        this.sound = sound
    }


}