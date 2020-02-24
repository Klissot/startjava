package com.startjava.lesson_4.calculator;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calc = new Calculator();

        String answer;
        do {
            System.out.print("Введите математическое выражение: ");
            String operation = scan.nextLine();
            String[] mathOperation = operation.split(" ");
            calc.calculate(mathOperation);
            do {
                System.out.println("Хотите продолжить? [Да / Нет]");
                answer = scan.nextLine();
            } while(!(answer.equals("Да") || answer.equals("Нет")));
        } while(!answer.equals("Нет"));
    }
}