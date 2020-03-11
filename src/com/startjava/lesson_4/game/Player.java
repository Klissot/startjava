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

    public int getEnteredNumber(int i) {
        return enteredNumbers[i];
    }

    public void setEnteredNumber(int i, int number) {
        enteredNumbers[i] = number;
    }

    public int[] getEnteredNumbers(int i) {
        return Arrays.copyOf(enteredNumbers, i + 1);
    }

    public void zeroingOfEnteredNumbers(int i) {
        Arrays.fill(enteredNumbers, 0, i + 1, 0);
    }

}