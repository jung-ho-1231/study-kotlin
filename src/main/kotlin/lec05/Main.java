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
}


