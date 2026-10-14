class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        int ans = 0;
        while(j != s.length()){
            if(map.containsKey(s.charAt(j))){
                int idx = map.get(s.charAt(j));
                i = Math.max(idx + 1 , i);
            }
            map.put(s.charAt(j),j);
            int len = j - i + 1;
            ans = Math.max(ans,len);
            j++;

        }
        return ans;
        
    }
}