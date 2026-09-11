class Solution {
    public double findMaxAverage(int[] nums, int k) {       
        int i = 0;
        int j = 0;
        int sum = 0;
        double avg = Integer.MIN_VALUE;
        while(j<nums.length){
            sum+=nums[j];
            if(j - i + 1 > k){
                sum-=nums[i];
                i++;
            }
            if(j - i + 1 == k)
            avg = Math.max(avg ,(double) sum/(j - i + 1));
            j++;
        }
        return avg;
    }
}