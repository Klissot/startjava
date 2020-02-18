package com.startjava.lesson_2_3_4.robot;

public class JaegerTest {
    public static void main(String[] args) {

        Jaeger jaeger1 = new Jaeger("Striker Eureka", "Australia", 76.2, 1850, 10, 10, 9, "WMB2x90 AKM Chest launcher");

        jaeger1.drift();
        System.out.println();
        System.out.println("Name of model: " + jaeger1.getModelName());
        System.out.println("Origin: " + jaeger1.getOrigin());
        System.out.println("Height: " + jaeger1.getHeight());
        System.out.println("Weight: " + jaeger1.getWeight());
        System.out.println("Speed: " + jaeger1.getSpeed());
        System.out.println("Armor: " + jaeger1.getArmor());
        System.out.println("Weapon: " + jaeger1.getWeapon());
        System.out.println();
        
        jaeger1.scanKaiju();
        System.out.println();

        Jaeger jaeger2 = new Jaeger("Tacit Ronin", "Japan", 74.37, 7450, 8, 7, 3, "Fangblades");

        jaeger2.drift();
        System.out.println();
        System.out.println("Name of model: " + jaeger2.getModelName());
        System.out.println("Origin: " + jaeger2.getOrigin());
        System.out.println("Height: " + jaeger2.getHeight());
        System.out.println("Weight: " + jaeger2.getWeight());
        System.out.println("Speed: " + jaeger2.getSpeed());
        System.out.println("Armor: " + jaeger2.getArmor());
        System.out.println("Weapon: " + jaeger2.getWeapon());
        System.out.println();
        
        jaeger2.scanKaiju();
        System.out.println();
    }
}