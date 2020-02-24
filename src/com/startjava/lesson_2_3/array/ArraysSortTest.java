package com.startjava.lesson_2_3.array;

import java.util.Arrays;

public class ArraysSortTest {
    public static void main(String[] args) {
        String[] arrayName = {
                "Иван",
                "Василий",
                "Сергей",
                "Олег",
                "Виктория"};
        Arrays.sort(arrayName);
        System.out.println(Arrays.toString(arrayName));
    }
}
