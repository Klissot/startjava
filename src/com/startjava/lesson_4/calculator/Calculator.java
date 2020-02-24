package com.startjava.lesson_4.calculator;

public class Calculator {
    private int firstValue, secondValue, result;
    private String operations;

    public int getFirstValue() {
        return firstValue;
    }

    public void setFirstValue(int firstValue) {
        this.firstValue = firstValue;
    }

    public void setSecondValue(int secondValue) {
        this.secondValue = secondValue;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public String getOperations() {
        return operations;
    }

    public void setOperations(String operations) {
        this.operations = operations;
    }

    public void calculate() {
        switch (operations) {
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