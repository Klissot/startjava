package com.startjava.lesson_2_3.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of the first player:");
        Player player1 = new Player(scan.nextLine());
        System.out.println("First player name is " + player1.getName());
        System.out.println("Enter the name of the second player:");
        Player player2 = new Player(scan.nextLine());
        System.out.println("Second player name is " + player2.getName());
        GuessNumber gn = new GuessNumber(player1, player2);

        String answer;
        do {
            gn.runGame();
            do {
                System.out.println("Would you like to continue?");
                answer = scan.next();
            } while(!(answer.equals("Yes") || answer.equals("No")));
        } while(!answer.equals("No"));
    }
}