class Solution {
    public int firstUniqChar(String s) {
        
        HashMap<Character,Integer> map = new LinkedHashMap<>();
        for(int i = 0 ; i<s.length() ; i++){
            if(map.containsKey(s.charAt(i)))
            map.put(s.charAt(i),Integer.MIN_VALUE);
            else
            map.put(s.charAt(i),i);
        }
        for( char c : map.keySet()){
            int ans = map.get(c);
            if(ans != Integer.MIN_VALUE)
            return ans;
            
        }
        return -1;

        
    }
}