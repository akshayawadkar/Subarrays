package com.company;

public class _7_FindMissingNumber {

    public static void main(String[] args) {

        int[] arr = {3, 2, 4, 6,1};
        System.out.println(findMissing(arr));
    }

    private static int findMissing(int[] arr) {

        int n = arr.length + 1;
        int expectedSum = (n * (n + 1)) / 2;
        int actualSum = 0;
        for(int i : arr){
            actualSum += i;
        }

        return expectedSum - actualSum;
    }

    // 1 2 3 4 5 = > 15 - > (5 * ( 5 + 1)) / 2

}
