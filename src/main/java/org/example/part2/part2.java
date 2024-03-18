package org.example.part2;
import java.util.List;

public class part2 {
        public static int countHigh(List<String> collection) {
            int count = 0;
            for (String str : collection) {
                if (str.contains("High")) {
                    count++;
                }
            }
            return count;
        }

        public static String firstElement(List<String> collection) {
            if (collection.isEmpty()) {
                return "0";
            }
            return collection.get(0);
        }

        public static String lastElement(List<String> collection) {
            if (collection.isEmpty()) {
                return "0";
            }
            return collection.get(collection.size() - 1);
        }

        public static void main(String[] args) {
            List<String> collection = List.of("Highload", "High", "Load", "Highload");

            int highCount = countHigh(collection);
            System.out.println("Количество 'High' в коллекции: " + highCount);

            String first = firstElement(collection);
            System.out.println("Первый элемент коллекции: " + first);

            String last = lastElement(collection);
            System.out.println("Последний элемент коллекции: " + last);
        }
    }

