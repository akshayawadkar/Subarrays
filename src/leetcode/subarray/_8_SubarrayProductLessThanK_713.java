package leetcode.subarray;

class _8_SubarrayProductLessThanK_713 {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        
          if(k <= 1){
              return 0;
          }
        
        int count = 0;
        
        int left = 0, right = 0;
        int mul = 1;
        
        while(right < nums.length){
            
            mul = mul * nums[right];
            
            while(mul >= k){
                mul = mul / nums[left++];
            }
            count += (right - left + 1);
            right++;
        }
      
  
        return count;
    }
}