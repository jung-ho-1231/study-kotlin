package lec10.interfaceExmaple

interface Flyable {

    val swimAbility :Int
        get() = 3


    fun act(){
        println("파닥 파닥")
    }
}