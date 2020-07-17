package com.company;

public class _9_ArrayContainsCycle {


    public static void main(String[] args) {

        int[] arr = {};
        System.out.println(solve(arr));
    }

    private static boolean solve(int[] arr) {

        if(arr.length <= 1) {
            return false;
        }

        for(int i = 0; i < arr.length; i++){

            int slow, fast;

            slow = fast = i;

            boolean isForward = arr[i] > 0;

            while(true){

                slow = getNextPosition(arr, slow, isForward);

                if(slow == -1){
                    break;
                }

                fast = getNextPosition(arr, fast, isForward);

                if(fast == -1){
                    break;
                }

                fast = getNextPosition(arr, fast, isForward);
                if(fast == -1) {
                    break;
                }

                if(slow == fast) {
                    return true;
                }
            }

        }

        return false;
    }

    private static int getNextPosition(int[] arr, int index, boolean isForward) {

        boolean direction = arr[index] >= 0;

        if(direction != isForward){
            return -1;
        }

        int nextIndex = (index + arr[index]) % arr.length;

        if(nextIndex < 0){
            nextIndex += arr.length;
        }

        if(nextIndex == index){
            return -1;
        }

        return nextIndex;

    }
}
