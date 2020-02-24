package com.startjava.lesson_2_3.array;

import java.util.Scanner;

public class ArrayQuestMain {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массивов: ");
        int size = scan.nextInt();

        int[] array1 = new int[size];
        System.out.println("Первый массив:");
        for(int i = 0; i < array1.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i = 0; i < array1.length; i++) {
            array1[i] = ((int)(Math.random() * 10));
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        int[] array2 = new int[size];
        for(int i = 0; i < array2.length; i++) {
            System.out.println("Введите значения массива 2: ");
            array2[i] = scan.nextInt();
        }

        System.out.println("Второй массив:");
        for(int i = 0; i < array2.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.println();

        int[] arraySumm = new int[size];
        System.out.println("Значение индексов третьего массива: ");
        for(int i = 0; i < arraySumm.length; i ++) {
            arraySumm[i] = array1[i] + array2[i];
        }

        for(int i = 0; i < arraySumm.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i = 0; i < arraySumm.length; i++) {
            System.out.print(arraySumm[i] + " ");
        }


    }
}
