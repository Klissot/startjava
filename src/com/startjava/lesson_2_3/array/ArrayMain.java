package com.startjava.lesson_2_3.array;

public class ArrayMain {
    public static void main(String[] args) {

        int[] numbers = new int[6];

        float[] numbers1 = {5.1f, .5f, 200.5f};

        System.out.println(numbers.length);
        System.out.println(numbers1.length);

//        System.out.println(numbers);

        for (float number : numbers1) {
            System.out.print(number + " ");
        }

        for (int i = 0; i < numbers1.length; i++) {
            numbers[i] = i * 10;
        }

        for (float number : numbers1) {
            System.out.print(number + " ");
        }


        String[] text = new String[3];
//        text -> array[ | | ]

        for(String string: text) {
            System.out.println(string);
        }
    }
}
