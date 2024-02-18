package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        System.out.println(checkSum(a, b));

        int x = 64;
        checkNumber(x);

        int y = 65;
        System.out.println(isPositiveNumber(y));

        String message = "Hello, world!";
        int count = 3;
        printStringMultipleTimes(message, count);

        int year = 2024;
        boolean isLeapYear = checkYear(year);
        System.out.println(isLeapYear);

        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Исходный массив:");
        printArray(arr);

        invertArray(arr);
        System.out.println("Измененный массив:");
        printArray(arr);

        int[] array100 = showNewArray100();
        System.out.println("\nМассив от 1 до 100:");
        printArray(array100);

        int[] mas = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Полученный массив:");
        int[] resultMas = dividedMas(mas);
        printArray(resultMas);

        int n = 4;
        int[][] array = new int[n][n];
        fillDiagonal(array);
        printArray(array);

        int len = 5;
        int initialValue = 3;

        int[] result = createArray(len, initialValue);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static boolean checkSum(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void checkNumber(int x) {
        if (x >= 0) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is negative");
        }
    }

    public static boolean isPositiveNumber(int y) {
        return y >= 0;
    }

    public static void printStringMultipleTimes(String str, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(str);
        }
    }

    public static boolean checkYear(int year) {
        return ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void invertArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
    }

    public static int[] showNewArray100() {
        int[] array100 = new int[100];
        for (int i = 0; i < array100.length; i++) {
            array100[i] = i + 1;
        }
        return array100;
    }

    public static int[] dividedMas(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < 6) {
                mas[i] = mas[i] * 2;
            }
        }
        return mas;
    }

    public static void fillDiagonal(int[][] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            arr[i][i] = 1;
            arr[i][n - 1 - i] = 1;
        }
    }

    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }
}