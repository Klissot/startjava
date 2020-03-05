package com.startjava.lesson_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] enteredNumber = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getEnteredNumber(int i) {
            return enteredNumber[i];
    }

    public void setEnteredNumber(int count, int numberOfPlayer) {
        if (count != enteredNumber.length - 1) {
            enteredNumber[count] = numberOfPlayer;
        } else {
            enteredNumber[count] = numberOfPlayer;
            System.out.println("У игрока " + name + " закончились попытки");
        }
    }

    public void outputEnteredNumber() {
        System.out.println("Игрок " + name + " ввел числа: " + Arrays.toString(enteredNumber));
    }

    public void numberOfAttempts(int count, int selectedNumber) {
        int[] numberOfAttempts = Arrays.copyOf(enteredNumber, count + 1);
        if (numberOfAttempts.length == enteredNumber.length) {
            System.out.println("Игрок " + name + " угадал загаданное число " + selectedNumber + " с " + numberOfAttempts.length + " попытки!");
            outputEnteredNumber();
        } else {
            System.out.println("Игрок " + name + " угадал загаданное число " + selectedNumber + " с " + numberOfAttempts.length + " попытки!");
        }
    }
}