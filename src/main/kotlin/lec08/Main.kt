package lec08

fun main() {
    repeat("hello world")
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