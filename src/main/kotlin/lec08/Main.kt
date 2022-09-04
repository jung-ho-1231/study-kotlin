package lec08

fun main() {
    repeat("hello world")

    // 중간에 있는 num 은 그대로 사용하고 싶은 경우에는?
    // named argument 라는 함수를 호출하는 쪽에서 파라미터 이름을 명시해준다
    repeat("hell world" , userNewLine = false)
}
fun max (a :Int , b :Int) = if (a > b) a else b

// default parameter
fun repeat(str: String, num: Int = 3, userNewLine: Boolean = true) {
    for (i in 1..num) {
        if (userNewLine) {
            println(str)
        } else {
            println(str)
        }
    }
}