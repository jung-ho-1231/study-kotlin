package lec09

import java.lang.IllegalArgumentException
import java.util.*


fun main() {
    val person = Person(name = "hello", age = 100)
    println(person.getUppercaseName)
    person.age = 10
    println(person.age)
}

class Person(
    // 주 생성자 (primary constructor)
    val name: String,
    var age: Int
) {
    // 함수 생성시 한 번 호출되는 영역 (즉, 자바의 생성자)
    init {
        if (age < 0) {
            throw IllegalArgumentException("나이는 ${age} 일 수 없습니다.")
        }
    }

    val getUppercaseName: String
        get() = this.name.uppercase(Locale.getDefault())


    // 부 생성자 (secondary constructor), 부생성자는 최종적으로 this 로 호출해야 한다.
    constructor(name: String) : this(name, 1) {
        println("첫 번째 부 생성자")
    }

    constructor() : this("홍길동") {
        println("두 번째 부 생성자")
    }

    val isAdult: Boolean
        get() = this.age >= 20
}