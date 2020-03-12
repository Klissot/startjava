package com.startjava.lesson_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    Scanner scan = new Scanner(System.in);
    private Player player1;
    private Player player2;
    private boolean check;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void runGame() {
        System.out.println("Компьютер загадал число, попробуйте отгадать");
        System.out.println("Внимание! У вас есть только 10 попыток");
        int selectedNumber = (int) (Math.random() * 101);
        for (int i = 0; i < 10; i++) {
            int sum = i + 1;
            player1.setEnteredNumber(i, enterNumber(player1.getName()));
            check(player1.getEnteredNumber(i), selectedNumber);
            if (check == true) {
                if (i != 9) {
                System.out.println("Поздравляем! Игрок " + player1.getName() + " угадал число " + selectedNumber + " c " + sum + " попытки!");
                player1.zeroingOfEnteredNumbers(i);
                break;
                } else {
                    System.out.println("Поздравляем! Игрок " + player1.getName() + " угадал число " + selectedNumber + " c " + sum + " попытки!");
                    System.out.println("Игрок " + player1.getName() + " ввел числа: " + Arrays.toString(player1.getEnteredNumbers(i)));
                    player1.zeroingOfEnteredNumbers(i);
                    break;
                }
            } else {
                if (i == 9) {
                    System.out.println("У игрока " + player2.getName() + " закончились попытки!");
                }
            }
            player2.setEnteredNumber(i, enterNumber(player2.getName()));
            check(player2.getEnteredNumber(i), selectedNumber);
            if (check == true) {
                if (i != 9) {
                    System.out.println("Поздравляем! Игрок " + player2.getName() + " угадал число " + selectedNumber + " c " + sum + " попытки!");
                    player2.zeroingOfEnteredNumbers(i);
                    break;
                } else {
                    System.out.println("Поздравляем! Игрок " + player2.getName() + " угадал число " + selectedNumber + " c " + sum + " попытки!");
                    System.out.println("Игрок " + player2.getName() + " ввел числа: " + Arrays.toString(player2.getEnteredNumbers(i)));
                    player2.zeroingOfEnteredNumbers(i);
                    break;
                }
            } else {
                if (i == 9) {
                    System.out.println("У игрока " + player2.getName() + " закончились попытки!");
                    System.out.println("Числа, введенные игроками:");
                    System.out.println("Первый игрок: " + Arrays.toString(player1.getEnteredNumbers(i)));
                    System.out.println("Второй игрок: " + Arrays.toString(player2.getEnteredNumbers(i)));
                    player1.zeroingOfEnteredNumbers(i);
                    player2.zeroingOfEnteredNumbers(i);
                }
            }
        }
    }

    private int enterNumber(String name) {
        System.out.print("Игрок " + name + " введите число: ");
        int number = scan.nextInt();
        return number;
    }

    private void check(int number, int selectedNumber) {
        if (number != selectedNumber) {
            if (number < selectedNumber) {
                System.out.println("Введенное число меньше загаданного!");
            } else if (number > selectedNumber) {
                System.out.println("Введенное число больше загаданного!");
            }
            check = false;
        } else {
            check = true;
        }
    }
}