package lesson7;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 2;
        arr[1] = 12;
        arr[2] = 3;
        arr[3] = 9;
        arr[4] =6;
        System.out.println("unsorted array");
        printArray(arr);
        Arrays.sort(arr);
        System.out.println("\nSorted array:");
        printArray(arr);
    }

// Print array
            private static void printArray(int[] arr) {
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }
            }
}


