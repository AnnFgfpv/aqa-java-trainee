package exercise_3;

public class Main {

    public static void main(String[] args) {

        printColor();
    }

    public static void printColor() {

        int value = -56789; // Любое заданное значение переменной value

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else if (value > 100){
            System.out.println("Зеленый");
        }
    }
}

