package com.startjava.lesson_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    Scanner scan = new Scanner(System.in);
    private Player player1;
    private Player player2;
    private int hidenNumber;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void runGame() {
        System.out.println("Компьютер загадал число, попробуйте отгадать");
        System.out.println("Внимание! У вас есть только 10 попыток");
        hidenNumber = (int) (Math.random() * 101);
        for (int i = 0; i < 10; i++) {
            player1.setEnteredNumber(i, enterNumber(player1.getName()));
            if (compareNumbers(player1.getEnteredNumber(i))) {
                if (compareIndexForWin(i, player1.getName(), player1.getEnteredNumbers(i).length)) {
                    player1.zeroingOfEnteredNumbers(i);
                    break;
                } else {
                    System.out.println("Игрок " + player1.getName() + " ввел числа: " + Arrays.toString(player1.getEnteredNumbers(i)));
                    player1.zeroingOfEnteredNumbers(i);
                    break;
                }
            } else {
                compareIndexForDefeat(i, player1.getName());
            }
            player2.setEnteredNumber(i, enterNumber(player2.getName()));
            if (compareNumbers(player2.getEnteredNumber(i))) {
                if (compareIndexForWin(i, player2.getName(), player2.getEnteredNumbers(i).length)) {
                    player2.zeroingOfEnteredNumbers(i);
                    break;
                } else {
                    System.out.println("Игрок " + player2.getName() + " ввел числа: " + Arrays.toString(player2.getEnteredNumbers(i)));
                    player2.zeroingOfEnteredNumbers(i);
                    break;
                }
            } else {
                if (compareIndexForDefeat(i, player2.getName())) {
                    player1.zeroingOfEnteredNumbers(i);
                    player2.zeroingOfEnteredNumbers(i);
                    break;
                }
            }
        }
    }

    private int enterNumber(String name) {
        System.out.print("Игрок " + name + " введите число: ");
        return scan.nextInt();
    }

    private boolean compareNumbers(int number) {
        if (number != hidenNumber) {
            if (number < hidenNumber) {
                System.out.println("Введенное число меньше загаданного!");
            } else if (number > hidenNumber) {
                System.out.println("Введенное число больше загаданного!");
            }
            return false;
        } else {
            return true;
        }
    }

    private boolean compareIndexForWin(int i, String name, int attemt) {
        System.out.println("Поздравляем! Игрок " + name + " угадал число " + hidenNumber + " c " + attemt + " попытки!");
        return (i != 9);
    }

    private boolean compareIndexForDefeat(int i, String name) {
        if (i == 9) {
            if (name.equals(player2.getName())) {
                System.out.println("У игрока " + name + " закончились попытки!");
                System.out.println("Числа, введенные игроками:");
                System.out.println("Первый игрок: " + Arrays.toString(player1.getEnteredNumbers(i)));
                System.out.println("Второй игрок: " + Arrays.toString(player2.getEnteredNumbers(i)));
            } else {
                System.out.println("У игрока " + name + " закончились попытки!");
            }
            return true;
        } else {
            return false;
        }
    }


}