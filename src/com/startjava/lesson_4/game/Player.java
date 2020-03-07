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

    public int[] getEnteredNumbers(int value) {
        return Arrays.copyOf(enteredNumbers, value + 1);
    }

    public int getEnteredNumber(int value) {
        return enteredNumbers[value];
    }

    public void setEnteredNumber(int value, int number) {
        enteredNumbers[value] = number;
    }

    public void zeroingOfEnteredNumbers(int value) {
        Arrays.fill(enteredNumbers, 0, value + 1, 0);
    }

}