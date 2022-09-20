package ru.mirea.kvbo1.vyaznikov.drunkardgame;

import java.util.ArrayList;

public class Game {
    private final ArrayList<Integer> firstPlayerCards;
    private final ArrayList<Integer> secondPlayerCards;
    private int turns;

    public Game(ArrayList<Integer> firstPlayerCards, ArrayList<Integer> secondPlayerCards) {
        this.firstPlayerCards = firstPlayerCards;
        this.secondPlayerCards = secondPlayerCards;
        this.turns = 0;
    }

    public Boolean isFirstCardWinner(int firstCard, int secondCard) {
        if ((firstCard == 0) & (secondCard == 9)) {
            return true;
        }
        if ((firstCard == 9) & (secondCard == 0)) {
            return false;
        }
        return (firstCard > secondCard);
    }

    public String nextTurn() {
        if (turns == 106) {
            return "botva";
        }
        if (this.firstPlayerCards.isEmpty()) {
            return "second " + this.turns;
        }
        if (this.secondPlayerCards.isEmpty()) {
            return "first " + this.turns;
        }
        if (isFirstCardWinner(this.firstPlayerCards.get(0), this.secondPlayerCards.get(0))) {
            this.firstPlayerCards.add(firstPlayerCards.get(0));
            this.firstPlayerCards.add(secondPlayerCards.get(0));
        } else {
            this.secondPlayerCards.add(firstPlayerCards.get(0));
            this.secondPlayerCards.add(secondPlayerCards.get(0));
        }
        this.firstPlayerCards.remove(0);
        this.secondPlayerCards.remove(0);

        this.turns += 1;
        this.printPosition();
        return nextTurn();
    }

    public String getGameResult() {
        System.out.println("Trace: ");
        return nextTurn();
    }

    private void printPosition() {
        for (Integer firstPlayerCard : this.firstPlayerCards) {
            System.out.print(firstPlayerCard + " ");
        }
        System.out.print("/ ");
        for (Integer secondPlayerCard : this.secondPlayerCards) {
            System.out.print(secondPlayerCard + " ");
        }
        System.out.print("# " + this.turns + "\n");
    }
}
