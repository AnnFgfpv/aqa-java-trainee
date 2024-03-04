package org.example;
class MyArraySizeException extends Exception {
    public MyArraySizeException(String message) {
        super(message);
    }
}

class MyArrayDataException extends Exception {
    public MyArrayDataException(String message) {
        super(message);
    }
}
public class Main {
    public static void main(String[] args) {
        String [][] array = {
                {"2","3","4","5"},
                {"1","2","2","4"},
                {"3","4","2","6"},
                {"4","5","9","7"}
        };
        try {
            checkArray(array);
        } catch (MyArraySizeException e) {
            System.out.println("Ошибка размера массива: " + e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println("Ошибка данных в массиве: " + e.getMessage());
        }
    }

    public static void checkArray(String [][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4) {
            throw new MyArraySizeException("Неправильное количество строк");
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException("Неправильное количество столбцов в строке " + i);
            }
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    MyArrayDataException exception = new MyArrayDataException("Неверные данные в ячейке [" + i + "][" + j + "]: " + array[i][j]);
                    e.printStackTrace();
                    throw exception;
                }
            }
        }
        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Все ок");

    }
}

