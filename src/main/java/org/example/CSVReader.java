package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {

    public static void main(String[] args) {
        String csvFile = "data.csv";
        String line;
        String cvsSplitBy = ";";

        List<String[]> rows = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {
                String[] values = line.split(cvsSplitBy);
                rows.add(values);
            }

            for (String[] row : rows) {
                for (String value : row) {
                    System.out.print(value + "\t");
                }
                System.out.println();
            }

        } catch (IOException e) {
            System.err.println("Error reading CSV file: " + e.getMessage());
        }
    }
}
