package com.startjava.lesson_1.game;

public class MyFirstGame {
    public static void main(String[] args) {
        System.out.println("The computer selected a number. Guessed him!");
        int selectedNumber = 44;
        int answer = 96;
        if(answer < selectedNumber) {
            while(answer != selectedNumber) {
                System.out.println("The entered number is less than the selected!");
                answer++;
            }
            System.out.println("Congratulations! You won!");
        } else if(answer > selectedNumber) {
            while(answer != selectedNumber) {
                System.out.println("The entered number is greater than the selected!");
                answer--;
            }
            System.out.println("Congratulations! You won!");
        } else {
            System.out.println("Congratulations! You won!");
        }
    }
}