package com.startjava.lesson_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    Scanner scan = new Scanner(System.in);
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void runGame() {
        System.out.println("Компьютер загадал число, попробуйте отгадать");
        System.out.println("Внимание! У вас есть только 10 попыток");
        int selectedNumber = (int) (Math.random() * 101);

        for (int i = 0; i < 10; i++) {
            System.out.print("Первый игрок, введите число: ");
            player1.setEnteredNumber(i, scan.nextInt());
            if (player1.getEnteredNumber(i) < selectedNumber) {
                System.out.println("Введенное число меньше загаданного!");
            } else if (player1.getEnteredNumber(i) > selectedNumber) {
                System.out.println("Введенное число больше загаданного!");
            } else {
                int sum = i +1;
                if (i == 9) {
                    System.out.println("Поздравляем! Игрок " + player1.getName() + " угадал число " + selectedNumber + " c " + sum + " попытки!");
                    System.out.println("Игрок " + player1.getName() + " ввел числа: " + Arrays.toString(player1.getEnteredNumbers(i)));
                } else {
                    System.out.println("Поздравляем! Игрок " + player1.getName() + " угадал число " + selectedNumber + " c " + sum + " попытки!");
                }
                break;
            }
            if (i == 9) {
                System.out.println("У игрока " + player1.getName() + " закончились попытки!");
            }

            System.out.print("Второй игрок, введите число: ");
            player2.setEnteredNumber(i, scan.nextInt());
            if (player2.getEnteredNumber(i) < selectedNumber) {
                System.out.println("Введенное число меньше загаданного!");
            } else if (player2.getEnteredNumber(i) > selectedNumber) {
                System.out.println("Введенное число больше загаданного!");
            } else {
                int sum = i + 1;
                if (i == 9) {
                    System.out.println("Поздравляем! Игрок " + player2.getName() + " угадал число " + selectedNumber + " c " + sum + " попытки");
                    System.out.println("Игрок " + player2.getName() + " ввел числа: " + Arrays.toString(player2.getEnteredNumbers(i)));
                } else {
                    System.out.println("Поздравляем! Игрок " + player2.getName() + " угадал число " + selectedNumber + " c " + sum + " попытки");
                }
                break;
            }
            if (i == 9) {
                System.out.println("У игрока " + player2.getName() + " закончились попытки!");
                System.out.println("Числа, введенные игроками:");
                System.out.println("Первый игрок: " + Arrays.toString(player1.getEnteredNumbers(i)));
                System.out.println("Второй игрок: " + Arrays.toString(player2.getEnteredNumbers(i)));
            }
        }
        player1.zeroingOfEnteredNumbers();
        player2.zeroingOfEnteredNumbers();
    }
}