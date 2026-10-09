class Solution {
    public int longestSubarray(int[] nums) {
        int i = 0;
        int j = 0;
        int len = 0;
       int idx = 0;
       int zero = 0;
       boolean flag = false;
     
        HashMap<Integer,Integer> map = new HashMap<>();
        while(j< nums.length){
            if(nums[j] == 0){
                zero++;
                
                if(zero > 1){
                    
                    i = idx + 1;

                }
                idx = j;
                flag = true;

            }
            if(zero == 0)
            len = Math.max(len , j - i +1);
            else
            len = Math.max(len , j - i );
            j++;
        }
       
       if(flag)
        return len;
        return len - 1;
        
        
    }
}