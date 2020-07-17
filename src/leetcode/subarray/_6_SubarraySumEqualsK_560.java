package leetcode.subarray;

import java.util.HashMap;
import java.util.Map;

public class _6_SubarraySumEqualsK_560 {



    public static int minSubArrayLen(int k, int[] nums) {
         int maxL = 0;
         Map<Integer, Integer> map = new HashMap<>();
         map.put(0, -1);
         int sum = 0;
         for(int i = 0; i < nums.length; i++){
             sum += nums[i];

             if(map.containsKey(sum - k)){
                 maxL = Math.max(maxL, i - map.get(sum - k));
             }

             map.putIfAbsent(sum, i);
         }
         return maxL;
    }

    public static void main(String[] args) {

        int[] arr = {2,3,1,2,4,3};
        int s = 7;

        System.out.println(minSubArrayLen(s, arr));

    }


}

