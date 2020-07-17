package leetcode.subarray;

public class _2_MaximumProductSubarray_152 {

    public static void main(String[] args) {

        int[] arr = {2,3,-2,4};
        System.out.println(largestProductSubArray(arr));

    }

    private static int largestProductSubArray(int[] arr) {
        int max = 0;
        int mul = 1;

        for(int i = 0; i < arr.length; i++){
            mul *= arr[i];
            max = Math.max(max, mul);
            if(mul == 0){
                mul = 1;
            }
        }
        mul = 1;
        for(int i = arr.length - 1; i >= 0; i--){
            mul *= arr[i];
            max = Math.max(max, mul);
            if(mul == 0){
                mul = 1;
            }
        }
        return max;
    }
}
