class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
       // int pref_sum = 0;
        int curr_sum = 0;
        int ans = 0;
        for(int num : nums){
            curr_sum+=num;
            int t = curr_sum - k;
            if(map.containsKey(t)){
            ans+= map.get(t);
            }
            map.put(curr_sum,map.getOrDefault(curr_sum,0)+1);
            
        }
        return ans;

        
    }
}