# Lec 09. 코틀린에서 클래스를 다루는 방법
- 코틀린에서는 필드를 만들면 getter 와 (필요에 따라) setter 가 자동으로 생긴다
    - 때문에 이를 프로퍼티라고 부른다.

- 코트린에서는 주 생성자가 필수이다
- 코틀린에서는 consturctor 키워드를 사용해 부생성자를 추가로 만들 수 있다.
  - 단, default parameter 나 정적 팩토리 메소드를 추천한다.

- 실제 메모리에 존재하는 것과 무관하게 customer getter, customer setter를 만들 수 있다.
- custome getter, custom setter 에서 무한루프를 막기위해 field 라는 키워드를 사용한다.
    - 이를 backing field 라고 부른다. 