package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumber {
    Scanner scan = new Scanner(System.in);
    private int selectedNumber;
    private Player player1;
    private Player player2;
    
    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void runGame() {
        System.out.println("The computer selected a number. Guessed him!");
        selectedNumber = (int)(Math.random()*101);
        do {
            System.out.println("First player, enter a number");
            player1.setNumber(scan.nextInt());
            if(player1.getNumber() < selectedNumber) {
                System.out.println("The entered number is less than the selected!");
            } else if(player1.getNumber() > selectedNumber) {
                System.out.println("The entered number is greater than the selected!");
            } else {
                System.out.println("Congratulations! The first player won! " + "The guessed number is " + selectedNumber);
                break;
            }

            System.out.println("Second player, enter a number");
            player2.setNumber(scan.nextInt());
            if(player2.getNumber() < selectedNumber) {
                System.out.println("The entered number is less than the selected!");
            } else if(player2.getNumber() > selectedNumber) {
                System.out.println("The entered number is greater than the selected!");
            } else {
                System.out.println("Congratulations! The first player won! " + "The guessed number is " + selectedNumber);
                break;
            }
        } while(true);
    }
}