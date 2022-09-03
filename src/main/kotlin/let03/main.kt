package let03

fun main() {

    val number1 = 3
    val number2: Long = number1.toLong()

    // 변수가 null 이라면 적절한 처리를 해주어야 한다.

    val number3 : Int? = 3
    val number4 : Long = number3?.toLong() ?: 0

}

fun printAgeIfPerson(obj: Any) {
    // is 는 자바의 instance of 에 해당
    if (obj is Person) {
        // as Person 는 자바의 (Person) obj 에 해당 (생략 가능)
        val person = obj as Person
        println(person.age)
    }
}