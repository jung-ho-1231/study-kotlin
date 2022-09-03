package let03

import java.time.Period

fun main() {

    val number1 = 3
    val number2: Long = number1.toLong()

    // 변수가 null 이라면 적절한 처리를 해주어야 한다.

    val number3 : Int? = 3
    val number4 : Long = number3?.toLong() ?: 0

    whatIfObjCanBeNull(null)
}

fun printAgeIfPerson(obj: Any) {
    // is 는 자바의 instance of 에 해당
    if (obj is Person) {
        // as Person 는 자바의 (Person) obj 에 해당 (생략 가능)
        val person = obj as Person
        println(person.age)
    }
}

fun printNothingIfNotPerson(obj: Any) {

    // !(obj is person) 도 되지만 아래와 같이 !is 로 사용할 수 있다.
    if (obj !is Person) {
        println("it's not person")
    }
}

// 만약 obj 에 null 이 들어올 수 있다면?
fun whatIfObjCanBeNull(obj: Any?) {

//    val person = obj as Person
//    whatIfObjCanBeNull(null) 이면
//    println(person.age) // NEP 발생!!!!

    val person = obj as? Person // as? 를 넣어줌으로써 null 들어올 수 있다는 가능성을 시사
    println(person?.age) // null 이 들어와도 null이 출력됨 (NEP 는 발생하지 않음)

}
