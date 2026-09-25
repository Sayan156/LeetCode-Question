class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> temp1 = new ArrayList<>();
        ArrayList<Integer> temp2 = new ArrayList<>();
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int i : nums1 ){
            set1.add(i);
        }
        for(int j : nums2 ){
            set2.add(j);
        }
        for(int i : nums1 ){
            
            if(!set2.contains(i)){
            if(!temp1.contains(i))
            temp1.add(i);
            }
        }

        for(int j: nums2 ){
            
            if(!set1.contains(j)){
            if(!temp2.contains(j))
            temp2.add(j);
            }
        }
        ans.add(temp1);
        ans.add(temp2);
        return ans;

        
    }
}