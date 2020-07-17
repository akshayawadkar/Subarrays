package leetcode.subarray;

import java.util.HashMap;
import java.util.Map;

public class _5_ContigiousSubarraySum_523 {



    public static void main(String[] args) {

        int[] arr = {23, 2, 4, 6, 7};
        int k = 6;

        System.out.println(checkSubarraySum(arr, k));

    }

    private static boolean checkSubarraySum(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        int sum = 0;

        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(k != 0){
                sum %= k;
            }

            if(map.containsKey(sum)){
                if(i - map.get(sum) >= 2){
                    return true;
                }
            }

            map.putIfAbsent(sum, i);
        }

        return false;
    }


}

