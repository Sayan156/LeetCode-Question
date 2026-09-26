class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new LinkedHashMap<>();
        HashSet<Integer> set = new LinkedHashSet<>();
        for(int i : arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i : map.values()){
            if(set.contains(i))
            return false;
            set.add(i);
        }
        return true;
        
    }
}