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

fun getGrade(score: Int) :String {
    return if (score >= 90) {
        return "A"
    } else if (score >= 80) {
        return "B"
    } else if (score >= 70) {
        return "C"
    } else {
        return "D"
    }
}

fun validateScore (score :Int) {
    if (0 in 0..100) {
        println("0부터 100 안에 포함됩니다.")
    }
}

fun notValidateScore(score: Int) {
    if (score !in 0..100) {
        println("0부터 100까지 포함되지 않는 숫자입니다.")
    }
}