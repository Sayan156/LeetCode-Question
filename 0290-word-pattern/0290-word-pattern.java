class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map = new HashMap<>();
        HashSet<String> seen = new HashSet<>();
        String[] str = s.split(" ");
        if(pattern.length() != str.length)
        return false;
        int i = 0;
        for(char c : pattern.toCharArray()){
            char key = c;
            String val = str[i++];
            if(map.containsKey(key))
            {
                String v = map.get(key);
                if(!v.equals(val))
                return false;

            }
            else if(seen.contains(val))
            return false;
            map.put(key,val);
            seen.add(val);

        }
        return true;

        
    }
}