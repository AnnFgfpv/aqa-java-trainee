package org.example;

public class Factorial {
    public static int num = 20;// Если ввести 21 и больше - работать не будет)
    public static final int MAX_NUM = 21;

    public static long getFactorial(){
        if (num < 0) {
            throw new IllegalArgumentException("Отрицательное число: " + num);
        }
        if (num > MAX_NUM) {
            throw new IllegalArgumentException("Число больше максимального: " + num);
        }
        long result = 1;
        for (int i = 1; i <= num; i++){
            result = result * i;
        }
        return result;
    }

    public static void main(String[] args) {
        try {
            System.out.println(getFactorial());}
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
