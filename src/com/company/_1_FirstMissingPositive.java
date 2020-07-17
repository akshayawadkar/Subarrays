package com.company;

import java.util.Arrays;

public class _1_FirstMissingPositive {


    public static void main(String[] args) {

        int[] arr = {-1, 11, 1, -3, 2, 10, 4};
        System.out.println(findFIrstMissingPositive(arr));

    }

    private static int findFIrstMissingPositive(int[] arr) {

        int i = 0, n = arr.length;

        while(i < n ){

            if(arr[i] > 0 && arr[i] <= n && arr[i] != arr[arr[i] - 1]){
                swap(arr, i, arr[i] - 1);
            }else{
                i++;
            }

        }
        System.out.println(Arrays.toString(arr));
        for(i = 0; i < n; i++){
            if(i + 1 != arr[i]){
                return i + 1;
            }
        }



        return n + 1;
    }

    private static void swap(int[] arr, int left, int right) {
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
    }
}
