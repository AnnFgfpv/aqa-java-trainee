package org.example;

public class Bowl {
    private int foodAmount;

    public Bowl(int foodAmount) {
        this.foodAmount = foodAmount;
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    public void decreaseFood(int amount) {
        if (foodAmount >= amount) {
            foodAmount -= amount;
        }
    }
    public void addFood(int amount) {
        foodAmount += amount;

    }
    public static void main (String[] args){
        Bowl bowl = new Bowl(10); // Создаем миску с 10 единицами еды

        System.out.println("Еды в миске до добавления: " + bowl.getFoodAmount());
        bowl.addFood(5); // Добавляем 5 единиц еды в миску
        System.out.println("Еды в миске после добавления: " + bowl.getFoodAmount());}
}

