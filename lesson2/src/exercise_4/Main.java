package exercise_4;

public class Main {

    public static void main(String[] args) {

        compareNumbers();
    }

    public static void compareNumbers() {
        int a = 56;
        int b = -123;
        if (a >= b) {
            System.out.println("a >= b");
        }  else if (a < b) {
            System.out.println("a < b");
        }

    }
}
