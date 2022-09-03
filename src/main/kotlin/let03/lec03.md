# Lec 03

## Kotlin 의 특이한 타입 3가지

- Any
- Unit
- Nothing

### Any

- Java 의 Object 역할. (모든 객체의 최상위 타입)
- 모든 Primitive Type 의 최상의 타입도 Any이다.
- Any 자체로는 null 을 포함할 수 없어 null 을 포함하고 싶다면, Any? 로 표현.
- Any 에 equals/ hashCode/ toString 존재.

### Unit

- Unit는 Java의 void 와 동일한 역할.
- (살짝 어려운 내용) void 와 다르게 Unit는 그 자체로 타입 인자로 사용 가능하다.
- 함수형 프로그래밍에서 Unit는 단 하나의 인스턴스만 갖는 타입을 의미, 즉, 코틀린의 Unit은 실제 존재하는 타입이라는 것을 표현

### Nothing

- Nothing 은 함수가 정상적으로 끝나지 않았다는 사실을 표현하는 역할
- 무조건 예외를 반환하는 함수/ 무한 루프 함수 등

> 실제로 코딩할 때 쓸일이 거의 없다. 일부로 예외만을 반환한다거나, 무한루프를 돌게 만드는 함수는 존재하지 않기 때문에


tip

- String interpolation / indexing 을 사용할 때...

변수 이름만 사용하더라도 `${변수}`를 사용하는 것이
1.가독성
2.일괄 변환
3.정규식 활용

측면에서 좋았습니다.
