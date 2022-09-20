package ru.mirea.kvbo1.vyaznikov.drunkardgame;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type 1 for random or 2 for input from keyboard:");
        int choice = input.nextInt();
        ArrayList<Integer> firstPlayerCards = new ArrayList<>();
        ArrayList<Integer> secondPlayerCards = new ArrayList<>();
        Random random = new Random();
        if (choice == 1) {
            while (firstPlayerCards.size() < 5) {
                int num = random.nextInt(0, 10);
                if (!firstPlayerCards.contains(num)) {
                    firstPlayerCards.add(num);
                }
            }
            for (int i = 0; i < 10; i++) {
                if (!firstPlayerCards.contains(i)) {
                    secondPlayerCards.add(i);
                }
            }
            System.out.println("First: " + firstPlayerCards + "\nSecond: " + secondPlayerCards);
        } else {
            System.out.println("Type the first player cards separated by space:");

            for (int i = 0; i < 5; i++) {
                int num = input.nextInt();
                firstPlayerCards.add(num);
            }
            System.out.println("Type the second player cards separated by space:");

            for (int i = 0; i < 5; i++) {
                int num = input.nextInt();
                secondPlayerCards.add(num);
            }
        }
        Game game = new Game(firstPlayerCards, secondPlayerCards);
        System.out.println("Result: " + game.getGameResult());
    }
}
// 6 3 8 2 1 / 0 4 9 5 7
// 3 8 2 1 6 0 / 4 9 5 7 #1
// 8 2 1 6 0 / 9 5 7 3 4 #2
// 2 1 6 0 / 5 7 3 4 8 9 #3
// 1 6 0 / 7 3 4 8 9 2 5 #4
// 6 0 / 3 4 8 9 2 5 1 7 #5
// 0 6 3 / 4 8 9 2 5 1 7 #6
// 6 3 / 8 9 2 5 1 7 0 4 #7
// 3 / 9 2 5 1 7 0 4 6 8 #8
// / 2 5 1 7 0 4 6 8 3 9 #9

// 9 3 5 2 1 / 0 4 8 6 7
// 3 5 2 1 / 4 8 6 7 9 0 #1
// 5 2 1 / 8 6 7 9 0 3 4 #2
// 2 1 / 6 7 9 0 3 4 5 8 #3
// 1 / 7 9 0 3 4 5 8 2 6 #4
// / 7 9 0 3 4 5 8 2 6 1 #5

// 4 0 1 9 7 / 2 3 5 6 8
// botva