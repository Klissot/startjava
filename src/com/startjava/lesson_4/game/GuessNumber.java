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
        do {
            for(int i = 0; i < player1.number.length; i++) {
                System.out.print("Первый игрок, введите число: ");
                player1.number[i] = scan.nextInt();
                if (i player1.number.length)
                if (player1.number[i] < selectedNumber) {
                    System.out.println("Введенное число меньше загаданного, попробуйте еще раз!");
                    if(i == player1.number.length - 1) {
                        System.out.println("У игрока  " + player1.getName() + " закончились попытки");
                    }
                } else if (player1.number[i] > selectedNumber) {
                    System.out.println("Введенное число больше загаданного, попробуйте еще раз!");
                    if(i == player1.number.length - 1) {
                        System.out.println("У игрока  " + player1.getName() + " закончились попытки");
                    }
                } else {
                    int[] numberOfAttemptsPlayer1 = Arrays.copyOf(player1.number, i+1);
                    System.out.println("Поздравляем, игрок " + player1.getName() + " угадал число " + selectedNumber + " с " + numberOfAttemptsPlayer1.length + " попыток");
                    break;
                }
                System.out.print("Второй игрок, введите число: ");
                player2.number[i] = scan.nextInt();
                if (player2.number[i] < selectedNumber) {
                    System.out.println("Введенное число меньше загаданного, попробуйте еще раз!");
                    if(i == player2.number.length - 1) {
                        System.out.println("У игрока " + player2.getName() + " закончились попытки");
                    }
                } else if (player2.number[i] > selectedNumber) {
                    System.out.println("Введенное число больше загаданного, попробуйте еще раз!");
                    if(i == player2.number.length - 1) {
                        System.out.println("У игрока " + player2.getName() + " закончились попытки");
                    }
                } else {
                    int[] numberOfAttemptsPlayer2 = Arrays.copyOf(player2.number, i+1);
                    System.out.println("Поздравляем, игрок " + player2.getName() + " угадал число " + selectedNumber + " с " + numberOfAttemptsPlayer2.length + " попыток");
                    break;
                }
            }
            System.out.println("Первый игрок ввел числа - " + Arrays.toString(player1.number));
            System.out.println("Второй игрок ввел числа - " + Arrays.toString(player2.number));
            break;
        } while(true);
    }
}