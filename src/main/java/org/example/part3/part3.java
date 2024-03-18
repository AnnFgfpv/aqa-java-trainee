package org.example.part3;
import java.util.TreeSet;

public class part3 {

    public static void main(String[] args) {
        TreeSet<String> collection = new TreeSet<>((s1, s2) -> {
            char letter1 = s1.charAt(0);
            char letter2 = s2.charAt(0);
            if (letter1 != letter2) {
                return Character.compare(letter1, letter2);
            } else {
                int number1 = Integer.parseInt(s1.substring(1));
                int number2 = Integer.parseInt(s2.substring(1));
                return Integer.compare(number1, number2);
            }
        });

        collection.add("f10");
        collection.add("a15");
        collection.add("f2");
        collection.add("f4");
        collection.add("f5");
        collection.add("b54");
        collection.add("a16");

        for (String element : collection) {
            System.out.println(element);
        }
    }
}
