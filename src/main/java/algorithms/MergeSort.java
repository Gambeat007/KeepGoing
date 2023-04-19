package algorithms;

import java.util.Arrays;

/**
 * Merge sort algorithm, "divide (halves arrays) & conquer (combines arrays)"
 * Big O(n log n)
 */

public class MergeSort {
    private static final int[] intArray = {5, 7, 15, 12, 9, 1, 55, 43, 12, 9, 0, 13, 21, 44};

    public static int[] divide(int[] array, int arrLength) {
        if (arrLength < 2)
            return array;

        int middleIndex = arrLength / 2;
        int[] leftTempArr = new int[middleIndex];
        int[] rightTempArr = new int[arrLength - middleIndex];

        System.arraycopy(array, 0, leftTempArr, 0, middleIndex);
        System.arraycopy(array, middleIndex, rightTempArr, 0, arrLength - middleIndex);

        divide(leftTempArr, middleIndex);
        divide(rightTempArr, arrLength - middleIndex);

        conquer(array, leftTempArr, rightTempArr, middleIndex, arrLength - middleIndex);
        return array;
    }

    private static void conquer(int[] array, int[] leftTempArr, int[] rightTempArr, int leftIndex, int rightIndex) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < leftIndex && j < rightIndex) {
            if (leftTempArr[i] <= rightTempArr[j]) {
                array[k++] = leftTempArr[i++];
            } else {
                array[k++] = rightTempArr[j++];
            }
        }
        while (i < leftIndex) {
            array[k++] = leftTempArr[i++];
        }
        while (j < rightIndex) {
            array[k++] = rightTempArr[j++];
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(divide(intArray, 14)));
    }
}
