package lec05

import java.lang.IllegalArgumentException

fun main() {

}

fun validateScoreIsNotNegative(score: Int) {
    if (score < 0) {
        throw IllegalArgumentException("${score} 는 0 보다 작을 수 없습니다.")
    }
}

fun getPassOrFail(score: Int): String {
    return if (score > 50) {
        "P"
    } else {
        "F"
    }
}