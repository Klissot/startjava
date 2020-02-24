package com.startjava.lesson_4.calculator;

public class Calculator {
    private int firstValue, secondValue, result;

    public void calculate(String mathOperation[]) {
        firstValue = Integer.parseInt(mathOperation[0]);
        secondValue = Integer.parseInt(mathOperation[2]);
        switch (mathOperation[1]) {
            case "+":
                result = firstValue + secondValue;
                System.out.println("Результат = " + result);
                break;
            case "-":
                result = firstValue - secondValue;
                System.out.println("Результат = " + result);
                break;
            case "*":
                result = firstValue * secondValue;
                System.out.println("Результат = " + result);
                break;
            case "/":
                result = firstValue / secondValue;
                System.out.println("Результат = " + result);
                break;
            case "%":
                result = firstValue % secondValue;
                System.out.println("Результат = " + result);
                break;
            case "^":
                result = (int)Math.pow(firstValue, secondValue);
                System.out.println("Результат = " + result);
                break;
            default:
                System.out.println("Verify the entered data!");
                break;
        }
    }
}