package com.startjava.lesson_2_3.calculator;

public class Calculator {
    private int firstNumber;
    private int secondNumber;
    private char mathOperation;
    private int result;

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public char getMathOperation() {
        return mathOperation;
    }

    public void setMathOperation(char mathOperation) {
        this.mathOperation = mathOperation;
    }

    public int getResult() {
        return result;
    }

    public int calculate() {
        switch(mathOperation) {
            case '+':
            	result = firstNumber + secondNumber;
                System.out.println("Result = " + result);
                break;
            case '-':
            	result = firstNumber - secondNumber;
                System.out.println("Result = " + result);
                break;
            case '*':
            	result = firstNumber * secondNumber;
                System.out.println("Result = " + result);
                break;
            case '/':
            	result = firstNumber / secondNumber;
                System.out.println("Result = " + result);
                break;
            case '%':
            	result = firstNumber % secondNumber;
                System.out.println("Result = " + result);
                break;
            case '^':
            	result = (int)Math.pow(firstNumber, secondNumber);
                System.out.println("Result = " + result);
                break;
            default:
            	System.out.println("Verify the entered data!");
                break;
        }
        return result;
    }
}