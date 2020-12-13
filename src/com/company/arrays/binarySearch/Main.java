package com.company.arrays.binarySearch;

import com.company.arrays.ArrayService;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int arrayLength = 50;

        int[] array = new int[arrayLength];

        ArrayService.insertRandomElements(array, 10, 100);

        ArrayService.printArray(array);

        Arrays.sort(array);

        ArrayService.printArray(array);

        binarySearch(array, 25);

    }

    private static void binarySearch(int[] sortedArray, int key) {
        int position;
        int first = 0;
        int last = sortedArray.length - 1;
        position = (first + last) / 2;

        while ((sortedArray[position] != key) && (first <= last)) {
            if (sortedArray[position] > key) {
                last = position - 1;
            } else {
                first = position + 1;
            }
            position = (first + last) / 2;
        }

        if (first <= last) {
            System.out.println("Искомое число " + key + " является " + position + " элементом в массиве.");
        } else {
            System.out.println("Искомое число не найдено в массиве.");
        }
    }
}
