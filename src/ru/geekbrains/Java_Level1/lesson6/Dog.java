package ru.geekbrains.Java_Level1.lesson6;

public class Dog extends Animal {
    public Dog() {
        setRunCount(500);
        setSwimCount(10);
        setJumpOver(0.5);
    }

    public Dog(int runCount, int swimCount, double jumpOver) {
        super(runCount, swimCount, jumpOver);
    }
}
