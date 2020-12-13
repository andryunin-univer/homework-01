package com.company.arrays;

public class ArrayService {

    public static void printArray(int[] array) {
        System.out.print("[ ");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print(array[array.length - 1] + " ]");
        System.out.println();
    }

    public static void insertRandomElements(int[] array, int lower, int upper) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*(upper - lower) + lower);
        }
    }
}
