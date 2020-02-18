package com.startjava.lesson_2_3_4.robot;

import java.util.Random;

public class Jaeger {

    String modelName;
    String origin;
    double height;
    int weight;
    int speed;
    int strength;
    int armor;
    String weapon;

    public String getModelName() {
        return modelName;
    }

    public String getOrigin() {
        return origin;
    }

    public double getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public int getSpeed() {
        return speed;
    }

    public int getStrength() {
        return strength;
    }

    public int getArmor() {
        return armor;
    }

    public String getWeapon() {
        return weapon;
    }

    public Jaeger(String modelName, String origin, double height, int weight, int speed, int strength, int armor, String weapon) {
        this.modelName = modelName;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.strength = strength;
        this.armor = armor;
        this.weapon = weapon;
    }

    public void drift() {
        System.out.println("You entered the drift");
    }

    public void move() {
        System.out.println("You have moved " + speed + " steps closer");
    }

    public void scanKaiju() {
        Random randScan = new Random();
        boolean scanner = randScan.nextBoolean();
        System.out.println();
        if(scanner) {
            System.out.println("Kaiju detected! Need to use weapons!");
            System.out.println();
            move();
            System.out.println();
            useWeapon();
        } else {
            System.out.println("Kaiju not found");
        }
    }
    
    public void useWeapon() {
        Random randAtack = new Random();
        boolean atack = randAtack.nextBoolean();
        System.out.println("Open fire!");
        System.out.println();
        if(atack) {
            System.out.println("Kaiju is destroyed! Congratulation!");
        } else {
            System.out.println("Jaeger is destroyed!");
        }
    }
}