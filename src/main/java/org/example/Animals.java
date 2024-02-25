package org.example;
public class Animals {
    protected String name;
    protected int maxRunDistance;
    protected int maxSwimDistance;
    protected boolean isHungry;
    protected static int countAnimals = 0;
    public Animals(String name, int maxRunDistance, int maxSwimDistance){
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        this.isHungry = false;
        countAnimals ++;
    }
    public void run(int distance){
        if (distance<= maxRunDistance){
            System.out.println(name + " пробежал(а) " + distance + " м.");
        } else { System.out.println(name + " не может пробежать такое расстояние.");
        }
    }
    public void swim(int distance) {
        if (distance <= maxSwimDistance) {
            System.out.println(name + " проплыл(а) " + distance + " м.");
        } else {
            System.out.println(name + " не может проплыть такое расстояние.");
        }
    }

    public static void main(String[] args) {
        Animals dog = new Animals("Жучка", 500, 10);
        Animals cat = new Animals("Барсик", 200, 0);

        dog.run(300);
        dog.swim(5);
        cat.run(150);
        cat.swim(50);

        Bowl bowl = new Bowl(10); // Создаем миску с 10 единицами еды
        System.out.println("Еды в миске до добавления: " + bowl.getFoodAmount());
        bowl.addFood(5); // Добавляем 5 единиц еды в миску
        System.out.println("Еды в миске после добавления: " + bowl.getFoodAmount());
    }
}






