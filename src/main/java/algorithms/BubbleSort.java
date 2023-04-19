package algorithms;

import java.util.Arrays;

/**
 * Bubble sort algorithm, pairs comparison, the highest element is on its way to the array end
 * Big O(n^2)
 */

public class BubbleSort {
    private static final int[] intArray = {5, 7, 15, 12, 9, 1, 55, 43, 12, 9, 0, 13, 21, 44};

    public static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++)
            for (int j = 0; j < (array.length - i - 1); j++)
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(bubbleSort(intArray)));
    }
}


