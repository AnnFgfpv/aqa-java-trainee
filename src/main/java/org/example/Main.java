package org.example;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map <String, Integer> wordsCount = new HashMap<>();
        String[] ArrayOfWords = {"Один","Один","Три","Четыре","Шесть","Шесть","Семь","Восемь","Девять","Девять","Одиннадцать"};
        for (String word : ArrayOfWords) {
            wordsCount.put(word, wordsCount.getOrDefault(word, 0) + 1);}

        Set<String> uniqueWords = new HashSet<>();
        for (String word : ArrayOfWords) {
            uniqueWords.add(word);
        }
        System.out.println("Уникальные слова: " + uniqueWords);

        for (Map.Entry<String, Integer> entry : wordsCount.entrySet()) {
            System.out.println("Слово '" + entry.getKey() + "' встречается " + entry.getValue() + " раз(а)");
        }
    }
}