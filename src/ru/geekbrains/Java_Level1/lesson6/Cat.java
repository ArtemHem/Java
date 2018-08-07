package ru.geekbrains.Java_Level1.lesson6;

public class Cat extends Animal {
    public Cat(){
     setRunCount(200);
     setSwimCount(1);
     setJumpOver(2);
    }

    public Cat(int runCount, int swimCount, double jumpOver) {
        super(runCount, swimCount, jumpOver);
    }

    @Override
    public void swim(int l) {
        System.out.println("Я это не сделаю");
    }
}
