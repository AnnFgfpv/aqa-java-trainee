package org.example.part1;

import java.util.Random;

public class part1 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        System.out.println("Рандомный набор чисел:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        int massCount = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                massCount++;
            }
        }

        System.out.println("Количество четных чисел: " + massCount);
    }
    }
