package com.startjava.lesson_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int attempts;
    private int[] enteredNumbers = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getEnteredNumber(int i) {
        return enteredNumbers[i];
    }

    public void setEnteredNumber(int i, int number) {
        enteredNumbers[i] = number;
    }

    public int getAttempts() {
        return attempts;
    }

    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }

    public int[] getEnteredNumbers() {
        return Arrays.copyOf(enteredNumbers, attempts);
    }

    public void clear() {
        Arrays.fill(enteredNumbers, 0, attempts - 1 , 0);
    }

}