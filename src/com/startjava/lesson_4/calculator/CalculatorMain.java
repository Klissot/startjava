package com.startjava.lesson_4.calculator;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите математическое выражение: ");
        String operation = scan.nextLine();
        String[] strings = operation.split(" ");
        Calculator calc = new Calculator();
        calc.setFirstValue(Integer.parseInt(strings[0]));
        calc.setSecondValue(Integer.parseInt(strings[2]));
        calc.setOperations(strings[1]);

        String answer;
        do {
            calc.calculate();
            do {
                System.out.println("Would you like to continue?");
                answer = scan.next();
            } while (!(answer.equals("Yes") || answer.equals("No")));
        } while (!answer.equals("No"));
    }
}