# 4. 상속 관련 키워드 4가지 정리

1. final: override 를 할 수 없게 한다. default 로 보지지 않게 한다.
    - override 를 할 수 없게 한다. default 로 보이지 않게 존재한다.
2. open : 반드시 override 해야 한다
3. abstract : 반드시 override 해야 한다.
4. override :  상위 타입을 오버라이드 하고 있다.

# Lec 10. 코틀린에서 상속을 다루는 방법

- 상속 또는 구현을 할 때 : 을 사용해야 한다
- 상위 클래스 상속을 구현할 때 생성자를 반드시 호출해야 한다.
- override를 필수로 붙여야 한다.
- 추상 멤버가 아니면 기본적으로 오버라이드가 불가능하다.
    - open 을 사용해주어야 한다.
- 상위 클래스의 생성자 또는 초기화 블록에서 open 프로퍼티를 사용하면 애기치 못한 버그가 생길 수 있다.