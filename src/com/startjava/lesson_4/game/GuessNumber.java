package com.startjava.lesson_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    Scanner scan = new Scanner(System.in);
    private Player player1;
    private Player player2;
    private int hidenNumber, i;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void runGame() {
        System.out.println("Компьютер загадал число, попробуйте отгадать");
        System.out.println("Внимание! У вас есть только 10 попыток");
        hidenNumber = (int) (Math.random() * 101);
        for (i = 0; i < 10; i++) {
            enterNumber(player1.getName());
            if (compareNumbers(player1.getEnteredNumber(i), player1.getName())) {
                break;
            } else {
                compareIndexForDefeat(player1.getName());
            }
            enterNumber(player2.getName());
            if (compareNumbers(player2.getEnteredNumber(i), player2.getName())) {
                break;
            } else {
                if (compareIndexForDefeat(player2.getName())) {
                    break;
                }
            }
        }
        player1.zeroingOfEnteredNumbers(i);
        player2.zeroingOfEnteredNumbers(i);
    }

    private void enterNumber(String name) {
        System.out.print("Игрок " + name + " введите число: ");
        if (name.equals(player1.getName())) {
            player1.setEnteredNumber(i, scan.nextInt());
        } else if (name.equals(player2.getName())) {
            player2.setEnteredNumber(i, scan.nextInt());
        }
    }

    private boolean compareNumbers(int number, String name) {
        if (number != hidenNumber) {
            if (number < hidenNumber) {
                System.out.println("Введенное число меньше загаданного!");
            } else {
                System.out.println("Введенное число больше загаданного!");
            }
            return false;
        } else {
            System.out.println("Поздравляем! Игрок " + name + " угадал число " + hidenNumber + " c " + (i + 1) + " попытки!");
            if (i == 9) {
                outputEnteredNumbers(name);
            }
            return true;
        }
    }

    private boolean compareIndexForDefeat(String name) {
        if (i == 9) {
            if (name.equals(player2.getName())) {
                System.out.println("У игрока " + name + " закончились попытки!");
                System.out.println("Числа, введенные игроками:");
                outputEnteredNumbers(player1.getName());
                outputEnteredNumbers(player2.getName());
            } else {
                System.out.println("У игрока " + name + " закончились попытки!");
            }
            return true;
        } else {
            return false;
        }
    }

    private void outputEnteredNumbers(String name) {
        if (name.equals(player1.getName())) {
            System.out.println("Первый игрок ввел числа: " + Arrays.toString(player1.getEnteredNumbers(i)));
        } else {
            System.out.println("Второй игрок ввел числа: " + Arrays.toString(player2.getEnteredNumbers(i)));
        }
    }
}