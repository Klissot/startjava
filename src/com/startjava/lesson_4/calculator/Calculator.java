package com.startjava.lesson_4.calculator;

public class Calculator {

    public void calculate(String[] mathExpression) {
        int firstNum = Integer.parseInt(mathExpression[0]);
        int secondNum = Integer.parseInt(mathExpression[2]);
        switch (mathExpression[1]) {
            case "+":
                int result = Math.addExact(firstNum, secondNum);
                System.out.println("Результат = " + result);
                break;
            case "-":
                result = Math.subtractExact(firstNum, secondNum);
                System.out.println("Результат = " + result);
                break;
            case "*":
                result = Math.multiplyExact(firstNum, secondNum);
                System.out.println("Результат = " + result);
                break;
            case "/":
                result = Math.floorDiv(firstNum, secondNum);
                System.out.println("Результат = " + result);
                break;
            case "%":
                result = Math.floorMod(firstNum, secondNum);
                System.out.println("Результат = " + result);
                break;
            case "^":
                result = (int)Math.pow(firstNum, secondNum);
                System.out.println("Результат = " + result);
                break;
            default:
                System.out.println("Проверьте введенные данные!");
                break;
        }
    }
}