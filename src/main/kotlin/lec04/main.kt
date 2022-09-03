package lec04

fun main() {
    val money1 = JavaMoney(2_000L)
    val money2 = money1
    val money3 = JavaMoney(1_000L)

    // 동일성 ( 주소 비교 )
    println(money1 === money3)
    // 동등성 ( 값 비교 )
    println(money1 == money2)
}