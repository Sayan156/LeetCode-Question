class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> pos_arr = new ArrayList<>();
        ArrayList<Integer> neg_arr = new ArrayList<>();
        for(int i : nums){
            if(i>0)
            pos_arr.add(i);
            else
            neg_arr.add(i);
        }
            int idx1 = 0;
            int idx2 = 0;
            for(int i = 0 ; i<nums.length ; i++){
                if(i%2 == 0)
                nums[i] = pos_arr.get(idx1++);
                else
                nums[i] = neg_arr.get(idx2++);
            }
            return nums;

        
        
    }
}