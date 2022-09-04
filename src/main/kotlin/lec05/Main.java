package lec05;

public class Main {
    public static void main(String[] args) {

    }

    private void validateScoreIsNotNegative(int score) throws IllegalAccessException {
        if (score < 0) {
            throw new IllegalAccessException(String.format("%s는 0보다 작을 수 없습니다.", score));
        }
    }

    private String getPassOrFail(int score) {
        return score >= 50 ? "P" : "F";
    }

    private String getGradeWithSwitch(int score) {
        switch (score / 10) {
            case 9:
                return "A";
            case 8:
                return "B";
            case 7:
                return "C";
            default:
                return "D";
        }

    }

    private boolean startsWithA(Object obj) {
        if (obj instanceof String) {
            return (((String) obj).startsWith("A"));
        } else {
            return false;
        }

    }

    private void judgeNumber(int number) {
        if (number == 1 || number == 0 || number == 1) {
            System.out.println("어디서 많이 본 숫자입니다.");
        } else {
            System.out.println("1, 0, -1 이 아닙니다.");
        }
    }

    private void judeNumber2(int number) {
        if (number == 0) {
            System.out.println("주어진 숫자는 0입니다.");
            return;
        }

        if (number % 2 == 0) {
            System.out.println("주어진 숫자는 짝수입니다.");
            return;
        }

        System.out.println("주어지는 숫자는 홀수입니다.");
    }

}


