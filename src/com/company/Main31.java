package com.company;
import java.util.Random;
import java.util.Scanner;

public class Main31 {
    final int SIZE = 3;
    final char DOT_X = 'x';
    final char DOT_O = 'o';
    final char DOT_EMPTY = '.';
    char[][] map = new char[SIZE][SIZE];
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    public static void main (String[] args) {
        new Main31().go();
    }
    void go() {
        initMap();
        while (true) {
            ai1Turn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Выиграл первый компьютер!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }
            ai2Turn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Выиграл второй компьютер!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }
        }
        System.out.println("Игра окончена.");
    }
    void initMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }
    void ai1Turn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }
    void ai2Turn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        map[y][x] = DOT_O;
    }
    void printMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE;j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    boolean checkWin(char dot) {
        int diag1, diag2, hor, ver;
        for (int i = 0; i < SIZE; i++) {
            hor = 0; ver = 0;
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == dot) {
                    hor++;
                }
                if (map[j][i] == dot) {
                    ver++;
                }
            }
            if (hor == SIZE|| ver == SIZE) {
                return true;
            }
        }
        diag1 = 0; diag2 = 0;
        for (int i = 0; i < SIZE; i++) {
            if (map[i][i] == dot) {
                diag1++;
            }
            if (map[i][SIZE - i - 1] == dot) {
                diag2++;
            }
        }
        if (diag1 == SIZE || diag2 == SIZE) {
            return true;
        }
        return false;
    }
    boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }
    boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x >= SIZE || y >= SIZE) return false;
        if (map[y][x] == DOT_EMPTY) return true;
        return false;
    }
}