package org.example;

import java.util.ArrayList;

class Fruit {
    float weight;

    public Fruit(float weight) {
        this.weight = weight;
    }
}

class Apple extends Fruit {
    public Apple() {
        super(1.0f);
    }
}

class Orange extends Fruit {
    public Orange() {
        super(1.5f);
    }
}

class Box<T extends Fruit> {
    private ArrayList<T> fruits;

    public Box() {
        fruits = new ArrayList<>();
    }

    public float getWeight() {
        float totalWeight = 0;
        for (T fruit : fruits) {
            totalWeight += fruit.weight;
        }
        return totalWeight;
    }

    public boolean compare(Box<?> otherBox) {
        return Math.abs(this.getWeight() - otherBox.getWeight()) < 0.0001;
    }

    public void putTo(Box<T> anotherBox) {
        if (this == anotherBox) {

            return;
        }

        if (this.fruits.isEmpty()) {

            return;
        }

        if (this.fruits.get(0) instanceof Apple && anotherBox.fruits.get(0) instanceof Orange) {
            return;
        }

        anotherBox.fruits.addAll(this.fruits);
        this.fruits.clear();
    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }
}

public class Main {
    public static void main(String[] args) {
        Box<Apple> appleBox1 = new Box<>();
        appleBox1.addFruit(new Apple());
        appleBox1.addFruit(new Apple());
        appleBox1.addFruit(new Apple());

        Box<Apple> appleBox2 = new Box<>();
        appleBox2.addFruit(new Apple());
        appleBox2.addFruit(new Apple());

        Box<Orange> orangeBox1 = new Box<>();
        orangeBox1.addFruit(new Orange());
        orangeBox1.addFruit(new Orange());
        orangeBox1.addFruit(new Orange());

        Box<Orange> orangeBox2 = new Box<>();
        orangeBox2.addFruit(new Orange());
        orangeBox2.addFruit(new Orange());

        System.out.println("Вес коробки с яблоками 1: " + appleBox1.getWeight());
        System.out.println("Вес коробки с яблоками 2: " + appleBox2.getWeight());
        appleBox1.putTo(appleBox2);//Демонстрация метода putTo
        System.out.println("Вес коробки с яблоками 1 после пересыпания: " + appleBox1.getWeight());
        System.out.println("Вес коробки с яблоками 2 после пересыпания: " + appleBox2.getWeight());

        System.out.println("Вес коробки с апельсинами 1: " + orangeBox1.getWeight());
        System.out.println("Вес коробки с апельсинами 2 (пересыпали из 1): " + orangeBox2.getWeight());

        System.out.println("Сравнение веса коробки с яблоками 1 и коробки с апельсинами 1 (до того как пересыпали): " + appleBox1.compare(orangeBox1));



    }
}