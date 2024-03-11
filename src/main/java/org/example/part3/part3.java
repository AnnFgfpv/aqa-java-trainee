package org.example.part3;
import java.util.Comparator;
import java.util.TreeSet;

public class part3 {

    public static void main(String[] args) {
        TreeSet<String> collection = new TreeSet<>(Comparator.comparing(part3::extractLetter)
                .thenComparingInt(part3::extractNumber));

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

    private static char extractLetter(String s) {
        return s.charAt(0);
    }

    private static int extractNumber(String s) {
        return Integer.parseInt(s.substring(1));
    }
}
