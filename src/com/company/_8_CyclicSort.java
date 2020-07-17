package com.company;

import java.util.Arrays;

public class _8_CyclicSort {


    public static void main(String[] args) {

        int[] arr = {13, 14, 16, 12, 11, 15};
//        int[] arr = {3, 4, 6, 2, 1, 5};
        solve(arr);


    }

    private static void solve(int[] nums) {

        System.out.println(Arrays.toString(nums));

        int i = 0, n = nums.length;

        int min = Arrays.stream(nums).min().getAsInt();


        while(i < n){

            if(nums[i] > 0 && nums[i] != nums[nums[i] - min]){
                swap(nums, i, nums[i] - min);
            }else{
                i++;
            }

        }

        System.out.println(Arrays.toString(nums));

    }

    private static void swap(int[] arr, int left, int right) {
        int tmp = arr[left];
        arr[left] = arr[right];
        arr[right] = tmp;
    }
}
