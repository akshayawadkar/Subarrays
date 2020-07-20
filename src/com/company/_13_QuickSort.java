package com.company;

import java.util.Arrays;

public class _13_QuickSort {

    private static void quickSort(int[] arr, int start, int end) {

        if (start < end) {

            int pivotIndex = partition(arr, start, end);
            quickSort(arr, start, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, end);
        }

    }

    private static int partition(int[] arr, int start, int end) {

        int writeIndex = start;

        int pivot = arr[end];

        for (int i = start; i < end; i++) {
            if (arr[i] <= pivot) {
                swap(arr, writeIndex++, i);
            }
        }

        swap(arr, writeIndex, end);

        return writeIndex;
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;

    }

    public static void main(String[] args) {

        int[] arr = {5, 12, 3, 1, 4, 6, 12, 8, 4, 8};

        System.out.println(Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }
}
