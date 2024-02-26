package org.example;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class CSVWriter {
    public static void main(String[] args) {

        String[] header = {"value 1", "value 2", "value 3"};

        int[][] data = {
                {100, 200, 300},
                {400, 500, 600}
        };

        String filePath = "data.csv";

        save(header, data, filePath);
    }
    public static void save(String[] header, int[][] data, String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {

            writer.write(String.join(";", header));
            writer.newLine();

            for (int[] row : data) {
                writer.write(String.join(";", convertIntArrayToStringArray(row)));
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error reading CSV file: " + e.getMessage());
        }
    }

    private static String[] convertIntArrayToStringArray(int[] array) {
        String[] stringArray = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            stringArray[i] = String.valueOf(array[i]);
        }
        return stringArray;
    }
}

