package com.startjava.lesson_4.game;

import java.util.Scanner;

public class GuessNumberMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите имя первого игрока:");
        Player player1 = new Player(scan.nextLine());
        System.out.println("Первого игрока зовут " + player1.getName());
        System.out.print("Введите имя второго игрока: ");
        Player player2 = new Player(scan.nextLine());
        System.out.println("Второго игрока зовут " + player2.getName());
        GuessNumber gn = new GuessNumber(player1, player2);

        String answer;
        do {
            gn.runGame();
            player1.zeroingEnteredsNubers();
            player2.zeroingEnteredsNubers();
            do {
                System.out.println("Хотите продолжить?");
                answer = scan.next();
            } while(!(answer.equals("Да") || answer.equals("Нет")));
        } while(!answer.equals("Нет"));
    }
}
