package com.startjava.lesson1.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Enter first value");
        Scanner scan = new Scanner (System.in);
        int firstNumber = scan.nextInt();
        System.out.println("Enter operation");
        char mathOperator = scan.next().charAt(0);
        System.out.println("Enter second value");
        int secondNumber = scan.nextInt();
        
        if (mathOperator == '+') {
            int result = firstNumber + secondNumber;
            System.out.println(firstNumber + " + " + secondNumber + " = " + result);
        } else if (mathOperator == '-') {
            int result = firstNumber - secondNumber;
            System.out.println(firstNumber + " - " + secondNumber + " = " + result);
        } else if (mathOperator == '*') {
            int result = firstNumber * secondNumber;
            System.out.println(firstNumber + " * " + secondNumber + " = " + result);
        } else if (mathOperator == '/') {
            int result = firstNumber / secondNumber;
            System.out.println(firstNumber + " / " + secondNumber + " = " + result);
        } else if (mathOperator == '%') {
            int result = firstNumber % secondNumber;
            System.out.println(firstNumber + " % " + secondNumber + " = " + result);
        } else if (mathOperator == '^') {
            int result = 1;
            for (int extent = 1; extent <= secondNumber; extent++) {
                result *= firstNumber;
            }
            System.out.println(firstNumber + " to the power " + secondNumber + " = " + result);
        }
    }
}