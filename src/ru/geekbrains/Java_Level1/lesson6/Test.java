package ru.geekbrains.Java_Level1.lesson6;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.print("Беги: ");
        dog.run(-450);
        System.out.print("Плыви: ");
        dog.swim(-7);
        System.out.print("Перепрыгивай: ");
        dog.jumpOver(-0.6);
        System.out.println();

        Dog pitbull = new Dog(400, 5, 1);
        System.out.print("Беги: ");
        pitbull.run(450);
        System.out.print("Плыви: ");
        pitbull.swim(7);
        System.out.print("Перепрыгивай: ");
        pitbull.jumpOver(0.6);
        System.out.println();

        Cat cat = new Cat();
        System.out.print("Беги: ");
        cat.run(150);
        System.out.print("Плыви: ");
        cat.swim(5);
        System.out.print("Перепрыгивай: ");
        cat.jumpOver(1);
        System.out.println();

        Cat brit = new Cat(100, 10, 1);
        System.out.print("Беги: ");
        brit.run(-150);
        System.out.print("Плыви: ");
        brit.swim(-5);
        System.out.print("Перепрыгивай: ");
        brit.jumpOver(3);
    }
}
