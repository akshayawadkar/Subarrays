package com.company;

import java.util.Arrays;

public class _14_MergeSort {

    public static void main(String[] args) {

        int[] arr = {5, 12, 3, 1, 4, 0};

        System.out.println(Arrays.toString(arr));
        mergeSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));


    }

    private static void mergeSort(int[] arr, int length) {

        if (length < 2) {
            return;
        }

        int mid = length / 2;

        int[] left_arr = new int[mid];
        int[] right_arr = new int[length - mid];

        int k = 0;
        for (int i = 0; i < length; i++) {
            if (i < mid) {
                left_arr[i] = arr[i];
            } else {
                right_arr[k] = arr[i];
                k++;
            }

        }

        mergeSort(left_arr, mid);
        mergeSort(right_arr, length - mid);

        merge(left_arr, right_arr, arr, mid, length - mid);

    }

    private static void merge(int[] left_arr, int[] right_arr, int[] arr, int left_size, int right_size) {

        int i = 0, l = 0, r = 0;

        while (l < left_size && r < right_size) {
            if (left_arr[l] < right_arr[r]) {
                arr[i] = left_arr[l];

                i++;
                l++;
            } else {
                arr[i] = right_arr[r];

                i++;
                r++;
            }
        }


        while (l < left_size) {
            arr[i] = left_arr[l];
            i++;
            l++;
        }


        while (r < right_size) {
            arr[i] = right_arr[r];
            i++;
            r++;
        }

    }

}