package com.company.arrays.bubbleSort;

import com.company.arrays.ArrayService;

public class Main {
    public static void main(String[] args) {

        int arrayLength = 50;

        int[] array = new int[arrayLength];

        ArrayService.insertRandomElements(array, 10, 100);

        ArrayService.printArray(array);

        bubbleSort(array);

        ArrayService.printArray(array);

    }

    private static int[] bubbleSort(int[] array) {
        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;

            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isSorted = false;
                }

                if (array[array.length - i] < (array[array.length - i - 1])) {
                    int temp = array[array.length - i];
                    array[array.length - i] = array[array.length - i - 1];
                    array[array.length - i - 1] = temp;
                    isSorted = false;
                }
            }
        }
        return array;
    }

}
