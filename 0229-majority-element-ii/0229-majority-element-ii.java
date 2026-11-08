class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums){
            map.put(i , map.getOrDefault(i , 0) + 1);
        }
        for (int i : nums){
            if(map.get(i) > nums.length/3)
            set.add(i);
        }
        return new ArrayList(set);
        

        
    }
}