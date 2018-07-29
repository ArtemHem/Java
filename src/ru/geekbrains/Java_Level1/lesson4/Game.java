package ru.geekbrains.Java_Level1.lesson4;

import java.util.Random;
import java.util.Scanner;

public class Game {

    public static Random rand = new Random();
    public static Scanner sc = new Scanner(System.in);

    public static final int SIZE = 3;
    public static char[][] map;

    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static final char DOT_EMPTY = '*';
    public static boolean gameOver = true;

    public static void main(String[] args) {

        initMap();
        do{
            printMap();
            runPlayer();
            checkWin(DOT_X,"Player");
            if (gameOver){
                runComp();
                checkWin(DOT_O,"Comp");
            }
        } while (gameOver);
        System.out.println("Game Over");

    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= map.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < map.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void runPlayer() {
        int x;
        int y;
        do {
            System.out.println("Введите X Y ");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!checkIn(x, y));
        map[x][y] = DOT_X;
    }

    public static boolean checkIn(int x, int y) {
        if (x < 0 || x >= map.length || y < 0 || y >= map.length) return false;
        if (map[x][y] == DOT_EMPTY) return true;
        return false;
    }

    public static void runComp() {
        int x;
        int y;

        do {
            x = rand.nextInt(map.length);
            y = rand.nextInt(map.length);
        } while (!checkIn(x, y));
        map[x][y] = DOT_O;

    }

    public static void checkWin(char dot, String message) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == dot) x++;
                if (map[j][i] == dot) y++;
            }
            if (x == 3 || y == 3) {
                System.out.println(message + " победил!");
                gameOver = false;
                printMap();
                return;
            }
            x = 0;
            y = 0;
        }
        for (int i = 0; i < map.length; i++) {
            if (map[i][i] == dot) x++;
        }
        for (int j = map.length - 1, i = 0;i<map.length || j > 0; i++,j--) {
            if (map[i][j] == dot) y++;
        }
        if (x == 3 || y == 3) {
            System.out.println(message + " победил!");
            gameOver = false;
            printMap();
            return;
        }

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == DOT_EMPTY) return;
            }
        }
        System.out.println("Ничья!");
        gameOver = false;
        printMap();
    }

}
