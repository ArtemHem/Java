package ru.geekbrains.Java_Level1.lesson3;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {

        //ex.1

        int number = rand.nextInt(10);
        int n = 0;
        boolean start = true;

        do {
            do {
                System.out.println("Угадайте число от 0 до 9");
                int a = sc.nextInt();

                if (a == number) {
                    System.out.println("Верно!");
                    break;
                } else if (a < number) {
                    System.out.println("Загаданное число больше");
                    n++;
                } else {
                    System.out.println("Загаданное число меньше");
                    n++;
                }
            } while (n < 3);
            System.out.println("Повторить игру еще раз? 1 - да/0 - нет");
            int next = sc.nextInt();
            if (next == 0) {
                start = false;
            } else {
                n = 0;
            }
        } while (start);


        //ex.2

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};

        int x = rand.nextInt(25);
        String word1 = words[x];
        char[] word = {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'};

        do {
            System.out.println("Введите слово: ");
            String word2 = sc.next();
            int world_lng = word1.length() <= word2.length() ? word1.length() : word2.length();
            if (word1.equals(word2)) {
                System.out.println("Верно!");
                break;
            } else {
                for (int i = 0; i < world_lng; i++) {
                    if (word1.charAt(i) == word2.charAt(i)) {
                        word[i] = word1.charAt(i);
                    }
                }
                System.out.println(word);
            }
        } while (true);

    }
}
