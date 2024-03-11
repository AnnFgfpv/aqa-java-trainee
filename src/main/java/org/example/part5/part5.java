package org.example.part5;
import java.util.Scanner;
import java.util.ArrayList;

public class part5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> logins = new ArrayList<>();

        System.out.println("Введите логин:");

        while (true) {
            String login = scanner.nextLine().trim();

            if (login.isEmpty()) {
                break;
            }

            logins.add(login);
        }

        System.out.println("Логины, начинающиеся на букву 'f':");
        for (String login : logins) {
            if (login.startsWith("f")) {
                System.out.println(login);
            }
        }
    }
}


