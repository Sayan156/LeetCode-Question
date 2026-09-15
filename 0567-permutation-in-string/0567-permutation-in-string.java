class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int i = 0;
        int j = 0;
        HashMap<Character , Integer> map= new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        while(j < s2.length())
        {
            map.put(s2.charAt(j) , map.getOrDefault(s2.charAt(j),0)+1);
            if(j - i + 1 > s1.length()){
                // remove that character from map
                int temp = map.get(s2.charAt(i));
                if(temp == 1)
                map.remove(s2.charAt(i));
                else
                map.put(s2.charAt(i),temp-1);
                i++;
            }
             if(j - i + 1 == s1.length()){
                // logic to check weather the substring is an answer
                
                for(char c : s1.toCharArray()){
                    map2.put(c,map2.getOrDefault(c,0)+1); 
                }
                if(map.equals(map2))
                return true;
                map2.clear();       

            }
            j++;

        }
        return false;
        
    }
}