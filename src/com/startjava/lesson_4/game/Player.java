package com.startjava.lesson_4.game;

public class Player {
    private String name;
    int[] number = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
