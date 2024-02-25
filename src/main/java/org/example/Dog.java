package org.example;

public class Dog extends Animals{
    private static int countDogs = 0;
    public Dog( String Zhuchka){
        super(Zhuchka,500,10);
        countDogs++;
    }
    public static int getCountDogs() {
        return countDogs;
    }
}
