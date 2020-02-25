package com.startjava.lesson_4.calculator;

public class Calculator {

    public void calculate(String[] mathOperation) {
        int firstValue = Integer.parseInt(mathOperation[0]);
        int secondValue = Integer.parseInt(mathOperation[2]);
        switch (mathOperation[1]) {
            case "+":
                int result = Math.addExact(firstValue, secondValue);
                System.out.println("Результат = " + result);
                break;
            case "-":
                result = Math.subtractExact(firstValue, secondValue);
                System.out.println("Результат = " + result);
                break;
            case "*":
                result = Math.multiplyExact(firstValue, secondValue);
                System.out.println("Результат = " + result);
                break;
            case "/":
                result = Math.floorDiv(firstValue, secondValue);
                System.out.println("Результат = " + result);
                break;
            case "%":
                result = Math.floorMod(firstValue, secondValue);
                System.out.println("Результат = " + result);
                break;
            case "^":
                result = (int)Math.pow(firstValue, secondValue);
                System.out.println("Результат = " + result);
                break;
            default:
                System.out.println("Проверьте введенные данные!");
                break;
        }
    }
}