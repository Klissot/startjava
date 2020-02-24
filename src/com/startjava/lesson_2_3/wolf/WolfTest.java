package com.startjava.lesson_2_3.wolf;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfLeader = new Wolf();
        wolfLeader.setName("Nika");
        System.out.println("Name - " + wolfLeader.getName());
        wolfLeader.setSex("Female");
        System.out.println("Sex - " + wolfLeader.getSex());
        wolfLeader.setAge(3);
        System.out.println("Age - " + wolfLeader.getAge());
        wolfLeader.setWeight(75.5);
        System.out.println("Weight - " + wolfLeader.getWeight());
        wolfLeader.setColor("Brown");
        System.out.println("Color - " + wolfLeader.getColor());

        wolfLeader.walk();
        wolfLeader.sit();
        wolfLeader.run();
        wolfLeader.howl();
        wolfLeader.hunt();
    }
}