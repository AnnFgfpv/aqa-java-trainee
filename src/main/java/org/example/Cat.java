package org.example;


public class Cat extends Animals {
    private static int countCats = 0;
    private boolean isHungry;

    public Cat(String name) {
        super(name, 200, 0);
        this.isHungry = true; // Коты по умолчанию голодны при создании
        countCats++;
    }

    public boolean isHungry() {
        return isHungry;
    }


    public void eatFromBowl(Bowl bowl, int amount) {
        if (bowl.getFoodAmount() >= amount) {
            bowl.decreaseFood(amount);
            isHungry = false; // Кот становится сытым, если удалось покушать
            System.out.println(name + " поел(а) из миски.");
        } else {
            System.out.println("В миске недостаточно еды для кормления " + name);
        }
    }

    public static void main(String[] args) {
        Cat[] catsArray = new Cat[5];

        catsArray[0] = new Cat("Барсик");
        catsArray[1] = new Cat("Рыжик");
        catsArray[2] = new Cat("Снежок");
        catsArray[3] = new Cat("Кокос");
        catsArray[4] = new Cat("Бывалый");


        Bowl bowl = new Bowl(15);

        for (Cat currentCat : catsArray) {
            currentCat.eatFromBowl(bowl, 5);
        }

        for (Cat currentCat : catsArray) {
            System.out.println(currentCat.name + " голоден: " + currentCat.isHungry());
        }
    }
}
