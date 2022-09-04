package let06;

import java.util.Arrays;
import java.util.List;

public class MainJava {
    public static void main(String[] args) {

        List<Long> number = Arrays.asList(1L, 2L, 3L);
        for (Long aLong : number) {
            System.out.println("aLong = " + aLong);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }

        for (int i = 3; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
