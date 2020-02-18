package com.startjava.lesson_2_3_4.person;

public class Person {
    
    String sex = "Male";
    String name = "Ivan";
    float height = 1.81f;
    int weight = 90;
    int age = 32;

    void walk() {
        System.out.println("You go.");
    }

    void sit() {
        System.out.println("You sat down!");
    }

    void toRun() {
        System.out.println("You started to run!");
    }

    String talk() {
        return "Hi!";
    }
    
    String learnJava() {
        return "You learned Lesson 1!";
    }
}