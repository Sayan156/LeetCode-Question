class Solution {
    public int numberOfSubstrings(String s) {
        int ans = 0;
        int i = 0;
        int j = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        while(j<s.length()){
            map.put(s.charAt(j) , j);
            if(map.containsKey('a') && map.containsKey('b') && map.containsKey('c')){
            // find minimum window 
            //find the minimum index 
            int idx_a = map.get('a');
            int idx_b = map.get('b');
            int idx_c = map.get('c');
            int min = Math.min(Math.min(idx_a,idx_b),idx_c);
            ans += min - 0 + 1;
            
            }
            map.put(s.charAt(j),j);
            
            j++;

        }
        return ans;
    }

}