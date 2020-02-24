package com.startjava.lesson_2_3.array;

import java.util.Arrays;

public class Array1Test {
    public static void main(String[] args) {
        int[] numbers = {3, 9, 11, 15};
        System.out.println(Arrays.toString(numbers));
        numbers[0] = 15;
        numbers[3] = 3;
        System.out.println(Arrays.toString(numbers));
        
    }
}
