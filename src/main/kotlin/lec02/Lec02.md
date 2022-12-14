# Lec 02.코틀린에서 null 을 다루는 방법

- 코틀린에서 null 이 들어갈 수 있는 타입은 완전히 다르게 간주한다.
    - 한 번 null 검사를 하게 되면 non - null 임을 컴파일러가 알 수 있다.
- null 이 아닌 경우에만 호출되는 Safe Call (?.) 이 있다.
- null 인 경우에만 호출되는 Elvis 연산자 (?:) 가 있다.
- null 이 절대 아닌 때 사용할 수 있는 널 아님 단언 (!!) 이 있다.
- Kotlin 에서 Java 코드를 사용할 때 `플랫폼 타입` 사용에 유의해야 한다.
  - Java 코드를 읽으며 널 가능성 확인 / Kotlin 으로 wrapping

> 안드로이드, jetbrains 의 @notnull 과 같은 어노테이션을 통해 코틀린은 null 가능성 유무를 확인한다.
> 어노테이션이 없다면 코틀린은 null 이 들어올 가능성이 존재한다고 인식한다.
> 이럴 경우 NPE 가 런타임 환경에서 일어날 가능성이 있으므로 항상 주의해야 한다.