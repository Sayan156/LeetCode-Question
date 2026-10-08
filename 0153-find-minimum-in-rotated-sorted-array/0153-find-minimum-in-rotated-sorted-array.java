class Solution {
    public int findMin(int[] nums) {
        if(nums.length == 1)
        return nums[0];
        int lo = 0;
        int hi = nums.length - 1;
        int smallest = Integer.MAX_VALUE;
        while(lo<=hi){
            int mid = lo + (hi - lo)/2;
            if(nums[lo] <= nums[mid])
            {
                smallest = Math.min(smallest,nums[lo]);
                lo = mid + 1;

            }
            else {// when the right side is sorted the mid element will be the smallest
            smallest = Math.min(smallest,nums[mid]);
            hi = mid - 1;
            }
        }
        return smallest;

        
    }
}