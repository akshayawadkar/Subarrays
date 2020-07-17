package leetcode.subarray;

import java.util.*;

class _9_SubarraySumDivByK {
    public int subarraysDivByK(int[] A, int K) {
     
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        
        int sum = 0;
        int result = 0;
        for(int i = 0; i < A.length; i++){
            
            sum += A[i];
            
            int remainder = sum % K;
            
            if(remainder < 0){
                remainder += K;
            }
            
            if(map.containsKey(remainder)){
                result += map.get(remainder);
            }
            
            map.put(remainder, map.getOrDefault(remainder, 0) + 1);
            
        }
        return result;
    }
}