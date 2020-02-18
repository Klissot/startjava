package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        String answer;
        Scanner scan = new Scanner(System.in);

        do {
            do {
                System.out.println("Enter first number");
                calc.setFirstNumber(scan.nextInt());
                System.out.println("Enter operation");
                calc.setMathOperation(scan.next().charAt(0));
                System.out.println("Enter second number");
                calc.setSecondNumber(scan.nextInt());

                calc.calculate();

                System.out.println("Would you like to continue?");
                answer = scan.next();
            } while(!(answer.equals("Yes") || answer.equals("No")));
        } while(!answer.equals("No"));
    }
}
