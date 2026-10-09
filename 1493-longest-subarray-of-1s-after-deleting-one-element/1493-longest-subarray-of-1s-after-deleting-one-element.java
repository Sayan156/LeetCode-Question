class Solution {
    public int longestSubarray(int[] nums) {
        int i = 0;
        int j = 0;
        int len = 0;
      //  int idx = -1;
      boolean flag = false;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(j< nums.length){
            if(nums[j] == 0){
                if(map.containsKey(0)){
                    int jump_i = map.get(0);
                    map.remove(0);
                    i = jump_i + 1;

                }
                map.put(0,j);
                flag = true;

            }
            if(! map.containsKey(0))
            len = Math.max(len , j - i +1);
            else
            len = Math.max(len , j - i );
            j++;
        }
        if(!flag)
        return len - 1;
        return len;
        
        
    }
}