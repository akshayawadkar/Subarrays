package leetcode.subarray;

public class _3_MinimumSizeSubarraySum_205 {

    public static int minSubArrayLen(int s, int[] nums) {

        int minL = Integer.MAX_VALUE;

        int left = 0, right = 0;

        int sum = 0;
        while(right < nums.length){

            sum += nums[right];

            while(sum >= s){
                minL = Math.min(minL, right - left + 1);
                sum -= nums[left++];
            }

            right++;

        }
        return minL == Integer.MAX_VALUE ? 0 : minL;
    }

    public static void main(String[] args) {

        int[] arr = {2,3,1,2,4,3};
        int s = 7;

        System.out.println(minSubArrayLen(s, arr));

    }


}

