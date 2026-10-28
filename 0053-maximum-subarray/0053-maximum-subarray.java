class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int i = 0;
        while(i<nums.length){
            if(sum < 0)
            sum = 0;
            sum += nums[i];
            max = Math.max(max, sum);
            
            i++;
        }
        return max;
        
    }
}