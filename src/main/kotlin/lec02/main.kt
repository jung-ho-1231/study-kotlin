package lec02

import java.lang.IllegalArgumentException

fun main() {
    /**
     * Safe call
     *
     * null 이 아니면 실행하고 null 이면 실행하지 않는다. (그대로 null)
     */

    val str: String? = "ABC"
    // null 이 아닌 경우에는 length, 아니면 null
    println(str?.length)

    /**
     * Elvis 연산자
     *
     * 앞의 연산 결과가 null 이면 뒤의 값을 사용
     */

    val str2: String? = "ABC"
    println(str2?.length ?: 0)

    // null assertion
    println(startsWith("abc"))
    // 그래도 혹시 null 이 들어가게 되면?
    println(startsWith(null)) // (런타입에러)  null point exception 발생!!
}

fun startWithA1(str: String?): Boolean {
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("null 이 들어왔습니다")
}


fun startWithA2(str: String?): Boolean? {
    return str?.startsWith("A")
}

fun startsWithA3(str: String?): Boolean? {
    return str?.startsWith("A") ?: false
}

fun startsWith(str: String?) : Boolean {
    return str!!.startsWith("A")
}