package lec04;

public class main {
    public static void main(String[] args) {
        JavaMoney money1 = new JavaMoney(2_000L);
        JavaMoney money2 = money1;
        JavaMoney money3 = new JavaMoney(1_000L);
        // 동일성 ( 주소 비교 )
        System.out.println(money1 == money2);
        // 동등성 ( 값 비교 )
        System.out.println(money1.equals(money3));
    }
}
