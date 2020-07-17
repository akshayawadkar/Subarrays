package com.company;

/**
 *  while(i < n){
 *
 *             if(arr[i] > 0 && arr[i] != arr[arr[i] - 1]){
 *                 swap(arr, i, arr[i] - 1);
 *             }else{
 *                 i++;
 *             }
 *         }
 *
 *
 *         this block of code puts the numbers in their actual positions
 */



import java.util.*;

public class _4_FindAllMissingAndDuplcates {

    public static void main(String[] args) {

//        int[] arr = {2, 6, 4, 4, 3, 2};
        int[] arr = {4, 3, 4, 1, 2};

        System.out.println(solve(arr));


    }

    private static List<List<Integer>> solve(int[] arr) {

        List<List<Integer>> result = new ArrayList<>();

        int i = 0, n = arr.length;
        while(i < n){

            if(arr[i] > 0 && arr[i] != arr[arr[i] - 1]){
                swap(arr, i, arr[i] - 1);
            }else{
                i++;
            }
        }

        System.out.println(Arrays.toString(arr));

        List<Integer> duplicates = new ArrayList<>();
        List<Integer> missing = new ArrayList<>();

        for(i = 0; i < n; i++){
            if(i + 1 != arr[i]){
                missing.add(i + 1);
                duplicates.add(arr[i]);
            }
        }

        result.add(duplicates);
        result.add(missing);
        return result;
    }

    private static void swap(int[] arr, int left, int right) {
        int tmp = arr[left];
        arr[left] = arr[right];
        arr[right] = tmp;
    }
}
