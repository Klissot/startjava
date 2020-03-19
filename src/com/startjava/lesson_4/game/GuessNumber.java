package com.startjava.lesson_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    Scanner scan = new Scanner(System.in);
    private Player player1;
    private Player player2;
    private int hiddenNumber;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void runGame() {
        System.out.println("Компьютер загадал число, попробуйте отгадать");
        System.out.println("Внимание! У вас есть только 10 попыток");
        hiddenNumber = (int) (Math.random() * 101);
        for (int i = 0; i < 10; i++) {
            if (makeMove(player1, i)) {
                break;
            }
            if (makeMove(player2, i)) {
                break;
            }
        }
        outputEnteredNumbers(player1);
        outputEnteredNumbers(player2);
        player1.clear();
        player2.clear();
    }

    private boolean makeMove(Player player, int i) {
        enterNumber(player, i);
        if (compareNumbers(player)) {
            return true;
        } else {
            compareAttempts(player);
            return false;
        }
    }

    private void enterNumber(Player player, int i) {
        System.out.print("Игрок " + player.getName() + " введите число: ");
        player.setEnteredNumber(i, scan.nextInt());
    }

    private boolean compareNumbers(Player player) {
        if (player.getEnteredNumber(player.getAttempts()) != hiddenNumber) {
            if (player.getEnteredNumber(player.getAttempts()) < hiddenNumber) {
                System.out.println("Введенное число меньше загаданного!");
            } else {
                System.out.println("Введенное число больше загаданного!");
            }
            return false;
        } else {
            System.out.println("Поздравляем! Игрок " + player.getName() + " угадал число " + hiddenNumber + " c " + (player.getAttempts() + 1) + " попытки!");
            return true;
        }
    }

    private void compareAttempts(Player player) {
        if (player.getAttempts() == 9) {
            System.out.println("У игрока " + player.getName() + " закончились попытки.");
        }
    }

    private void outputEnteredNumbers(Player player) {
        System.out.println("Игрок " + player.getName() + " ввел числа: " + Arrays.toString(player.getEnteredNumbers()));
    }
}