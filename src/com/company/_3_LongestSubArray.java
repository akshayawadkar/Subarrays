package com.company;

// longest sub array of 1ns after k negotiations
//Max Consecutive Ones I
//Max Consecutive Ones II
//Max Consecutive Ones III

public class _3_LongestSubArray {

    public static void main(String[] args) {

        int[] arr = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        System.out.println(maxZeros(arr, k));
    }

    private static int maxZeros(int[] arr, int k) {

        int maxL = 0;

        int left = 0, right = 0;

        while(right < arr.length){

            if(arr[right] == 0){
                k--;
            }

            if(k < 0){
                if(arr[left] == 0){
                   k++;
                }
                left++;
            }

            maxL = Math.max(maxL, right - left + 1);
            right++;
        }
        return maxL;
    }

}
