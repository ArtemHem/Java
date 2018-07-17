package ru.geekbrains.Java_Level1.lesson1;

public class Main {
    public static void main(String[] args) {

        byte  a = 0;
        short b = 0;
        int c = 5, j = 10;
        long d = 0L;
        float e = 0.0f;
        double f = 0.000;
        boolean g = true;
        char h = 'A';
        String i = "ABC";

        System.out.println("п.3 = " + getSum(c,c,c,c));
        System.out.println("п.4 = " + sumTrueFalse(c, j));
        getPosNeg(3); // п.5
        System.out.println("п.6 " + getNeg(-5));
        printMes("Артем"); // п.7
        checkYear(400); // п.8

    }

    public static int getSum(int a, int b, int c, int d){
        return a*(b+(c/d));
    }

    public static boolean sumTrueFalse(int a, int b){
        int sum = a + b;
        if (sum > 10 && sum <= 20){
            return true;
        }else{
            return false;
        }
    }

    public static void getPosNeg(int a){
        if (a >= 0){
            System.out.println("Положительное");
        }else {
            System.out.println("Отрицательное");
        }
    }

    public static boolean getNeg(int a){
        if (a < 0){
            return true;
        }else {
            return false;
        }
    }

    public static void printMes(String a){
        System.out.println("Привет " + a + "!");
    }

    public static void checkYear(int a){
        if ((a%4 == 0 && a%100 != 0) || a%400 == 0){
            System.out.println("Високосный");
        }else{
            System.out.println("Невисокосный");
        }
    }
}
