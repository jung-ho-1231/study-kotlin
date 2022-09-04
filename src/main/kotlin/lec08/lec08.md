# Lec 08. 코틀린에서 함수를 다루는 방법

- 함수의 문법은 Java 와 다르다!
- body 가 하나의 값으로 간주는 굉우 block 을 없앨 수 도 있고, block 이 없다면 반환 타입을 없앨 수도 있다.
```kotlin
fun max (a : Int, b : Int) Int = if (a > b ) a else b
fun max (a :Int, b : Int) = if (a > b) a else b
```
- 함수 파라미터에 기본값을 설정해 줄 수 있다.
- 함수를 호출할 때 특정 파라미터를 지정해 넣어줄 수 있다
- 가변인자에는 vararg 키워드를 사용하며, 가변인자 함수를 배열과 호출할 때는 *를 붙여주어야 한다.