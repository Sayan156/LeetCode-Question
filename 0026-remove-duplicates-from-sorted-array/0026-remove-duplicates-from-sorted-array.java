class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> set = new LinkedHashSet<>();
        for(int i : nums){
            set.add(i);
        }
        int ans = 0;
        for(int i : set){
            nums[ans++] = i;

        }
        return ans;
        
    }
}