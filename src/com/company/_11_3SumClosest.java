package com.company;

import java.util.Arrays;

public class _11_3SumClosest {

    public static void main(String[] args) {

        int[] arr = {-1, 2, 1, -4};
        System.out.println(solve(arr, 1));

    }

    private static int solve(int[] arr, int target) {

        if(arr.length == 0){
            return 0;
        }

        Arrays.sort(arr);
        int sum = 0;
        int diff = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            int j = i + 1, k = arr.length - 1;

            while(j < k){
                int currSum = arr[i] + arr[j] + arr[k];
                int currDiff = Math.abs(currSum - target);
                if(currDiff < diff){
                    diff = currDiff;
                    sum = currSum;
                }

                if(currSum > target){
                    k--;
                }else{
                    j++;
                }

            }
        }
        return sum;
    }
}
