package ru.geekbrains.Java_Level1.lesson6;

abstract public class Animal {

    private int runCount;
    private int swimCount;
    private double jumpOver;

    public Animal() {
    }

    public Animal(int runCount, int swimCount, double jumpOver) {
        if (checkPositive(runCount)) this.runCount = runCount;
        if (checkPositive(swimCount)) this.swimCount = swimCount;
        if (checkPositive(jumpOver)) this.jumpOver = jumpOver;
    }

    public void run(int l) {
        if (checkPositive(l)) printResult(l, runCount);
    }

    public void swim(int l) {
        if (checkPositive(l)) printResult(l, swimCount);
    }

    public void jumpOver(double h) {
        if (checkPositive(h)) printResult(h, jumpOver);
    }

    protected void setRunCount(int runCount) {
        if (checkPositive(runCount)) this.runCount = runCount;
    }

    protected void setSwimCount(int swimCount) {
        if (checkPositive(swimCount)) this.swimCount = swimCount;
    }

    protected void setJumpOver(double jumpOver) {
        if (checkPositive(jumpOver)) this.jumpOver = jumpOver;
    }

    private void printResult(int a, int b) {
        if (a <= 0) {
            System.out.println("Введите значение > 0.");
        } else {
            if (b > a) {
                System.out.println("Я это сделаю.");
            } else {
                System.out.println("Я это не сделаю.");
            }
        }
    }

    private void printResult(double a, double b) {
        if (a <= 0) {
            System.out.println("Введите значение > 0.");
        } else {
            if (b > a) {
                System.out.println("Я это сделаю.");
            } else {
                System.out.println("Я это не сделаю.");
            }
        }
    }

    private boolean checkPositive(int count) {
        if (count > 0) {
            return true;
        } else {
            System.out.println("Введите значение > 0.");
            return false;
        }
    }

    private boolean checkPositive(double count) {
        if (count > 0) {
            return true;
        } else {
            System.out.println("Введите значение > 0.");
            return false;
        }
    }
}
