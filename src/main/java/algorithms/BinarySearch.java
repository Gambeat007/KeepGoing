package algorithms;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Three approaches in binary search algorithm:
 * classic way (loop), Arrays.binarySearch(), Collections.binarySearch();
 * Big O(n^2)
 */

public class BinarySearch {
    private static int[] intArray = {5, 7, 9, 1, 9, 0};
    private static List<Integer> intList = new LinkedList<>();

    public static int binarySearch(int[] array, int target) {
        int firstIndex = 0;
        int lastIndex = array.length - 1;
        int middleIndex;

        while (firstIndex <= lastIndex) {
            middleIndex = (lastIndex + firstIndex) / 2;
            if (array[middleIndex] == target) {
                return middleIndex;
            } else if (array[middleIndex] < target) {
                firstIndex = middleIndex + 1;
            } else {
                lastIndex = middleIndex - 1;
            }
        }
        return -1;
    }

    public static int binarySearchArrays(int[] array, int target) {
        return Arrays.binarySearch(array, target);
    }

    public static int binarySearchCollections(List<Integer> list, int target) {
        return Collections.binarySearch(list, target);
    }

    public static void main(String[] args) {
        intList.add(5);
        intList.add(7);
        intList.add(9);
        intList.add(0);
        intList.add(9);
        intList.add(1);

        Arrays.sort(intArray);
        System.out.println("Sorted array: " + Arrays.toString(intArray));

        Collections.sort(intList);
        System.out.println("Sorted list: " + intList);

        System.out.println("\nClassic: target 7 on index: " + binarySearch(intArray, 7));
        System.out.println("Arrays: target 7 on index: " + binarySearchArrays(intArray, 7));
        System.out.println("Collections: target 7 on index: " + binarySearchCollections(intList, 7));
    }
}
