package leetcode.subarray;

public class _1_MaximumSubarray_KadanesAlgo_53 {

    public static void main(String[] args) {

        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSum(arr));

    }

    private static int maxSum(int[] arr) {

        int tillHere = arr[0], tillNow = 0;
        for(int i = 0; i < arr.length; i++){
            tillNow += arr[i];
            if(tillNow > tillHere){
                tillHere = tillNow;
            }

            if(tillNow < 0){
                tillNow = 0;
            }
        }

        return tillHere;
    }
}
