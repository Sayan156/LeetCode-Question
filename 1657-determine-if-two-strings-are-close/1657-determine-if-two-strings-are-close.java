class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length())
        return false;
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(int i = 0 ; i<word1.length() ; i++){
            map1.put(word1.charAt(i),map1.getOrDefault(word1.charAt(i),0)+1);
            map2.put(word2.charAt(i),map2.getOrDefault(word2.charAt(i),0)+1);
        }
        for(char c : word1.toCharArray()){
            if(!map2.containsKey(c))
            return false;
        }
        for(char c : word2.toCharArray()){
            if(!map1.containsKey(c))
            return false;
        }
        List<Integer> l1 = new ArrayList<>(map1.values());
        List<Integer> l2 = new ArrayList<>(map2.values());
        Collections.sort(l1);
        Collections.sort(l2);
        for(int i = 0 ; i<l1.size() ; i++){
            if(!l1.get(i).equals(l2.get(i)))
            return false;
        }
        
        return true;

        
    }
}