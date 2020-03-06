package com.startjava.lesson_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] enteredNumbers = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getEnteredNumbers() {
            return enteredNumbers;
    }

    public int getEnteredNumbers(int i) {
        return enteredNumbers[i];
    }

    public void setEnteredNumbers(int count, int number) {
        enteredNumbers[count] = number;
    }

    public int[] outputEnteredNumbers(int i) {
            int[] outputNumbers = Arrays.copyOf(enteredNumbers, i);
            return outputNumbers;
    }

    public void zeroingEnteredsNubers() {
        Arrays.fill(enteredNumbers, 0);
    }
}