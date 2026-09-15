class Solution {
    public int longestOnes(int[] nums, int k) {
        int i = 0;
        int j = 0;
        int ans = 0;
        int z =0;
        while(j<nums.length){
            if(nums[j] == 0){
                z++;
            }
            if(z > k){
                // remove the first 0
                while(nums[i] != 0)
                i++;
                i++;
                z--;

            }
            ans = Math.max(ans,j - i + 1);
            j++;

        }
        return ans;

        
    }
}