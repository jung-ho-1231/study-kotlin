# Lec07. 코틀린에서 예외를 다루는 방법

- try catch finally 구문은 문법적으로 완전히 동일하다
  - Kotlin 에서는 try catch 가 expression 이다.
- Kotlin 에서는 모든 예외는 unchecked exception 이다.
- Kotlin 에서는 try with resources 구문이 없다. 대신 코틀린의 언어적 특징을 활용해 close 를 호출한다.