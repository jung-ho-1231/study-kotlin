package lec09

import java.lang.IllegalArgumentException


fun main() {
    val person = Person(name = "정호", age= 100)
    println(person.name)
    person.age = 10
    println(person.age)
}

class Person(
    val name: String,
    var age :Int
) {
    // 함수 생성시 한 번 호출되는 영역 (즉, 자바의 생성자)
    init {
        if (age <  0) {
            throw IllegalArgumentException("나이는 ${age} 일 수 없습니다.")
        }
    }
}