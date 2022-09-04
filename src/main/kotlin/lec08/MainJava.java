package lec08;

public class MainJava {

    public int max(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }


    public void repeat(String str, int num, boolean userNewLine) {
        for (int i = 0; i < num; i++) {
            if (userNewLine) {
                System.out.println(str);
            } else {
                System.out.println(str);
            }
        }
    }

    public void repeat(String str, int num) {
        // repeat userNewLine 이 기본적으로 true 가 많이 사용된다면 자바에서는 오버로딩을 통해서 아래와 같이 구현한다.
        repeat(str, num, true);
    }

    public void repeat(String str) {
        // 마찬가지로 num 이 기본적으로 3을 많이 사용한다면 아래와 같이 변경할 수 있다.
        repeat(str, 3, true);
    }
}

