package com.startjava.lesson_2_3_4.array;

import java.util.Scanner;

public class ArayMaxElemenMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длинну массива: ");
        int maxLength = scanner.nextInt();
        int[] numbers = new int[maxLength];

        System.out.print("Заполните массив целыми числами через пробел: ");
        for(int i = 0; i < maxLength; i++) {
            numbers[i] = scanner.nextInt();
        }

        int max = numbers[0];
        for(int i = 0; i < maxLength - 1; i++) {
            if(max < numbers[i+1]) {
                max = numbers[i+1];
            }
        }

        System.out.println("Максимальное число равно " + max);
    }
}
