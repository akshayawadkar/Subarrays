package com.company;

import java.util.Arrays;

public class _2_ReverseArray {

    public static void main(String[] args) {

        int[] arr = {5, 4, 3, 2, 1};
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void reverse(int[] arr) {
        int left = 0, right = arr.length - 1;
        while(left <= right){
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
            left++;
            right--;
        }
    }
}
