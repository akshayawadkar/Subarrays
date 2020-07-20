package com.company;

import java.util.Arrays;

public class _12_3SumLesser {

    public static void main(String[] args) {

        int[] arr = {1, 2, -3, 4, -2};
        System.out.println(solve(arr, 1));


    }

    private static int solve(int[] arr, int target) {

        if(arr.length == 0){
            return 0;
        }

        Arrays.sort(arr);

        int result = 0;

        for(int i = 0; i < arr.length; i++){
            int j = i + 1, k = arr.length - 1;

            while(j < k){
                int sum = arr[i] + arr[j] + arr[k];

                if(sum < target){
                    result += (j - k);
                    j++;
                }else{
                    k--;
                }

            }

        }

        return result;
    }
}
