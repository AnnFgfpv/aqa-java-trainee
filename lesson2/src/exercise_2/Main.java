package exercise_2;

public class Main {

    public static void main(String[] args) {
checkSumSign();
    }
    public static void checkSumSign() {
        int a = 245;
        int b = -73;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");}
        else {System.out.println("Сумма отрицательная");
        }
    }
}