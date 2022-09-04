package lec09


fun main() {
    val person = Person(name = "정호", age= 100)
    println(person.name)
    person.age = 10
    println(person.age)
}

class Person(
    val name: String,
    var age :Int
)