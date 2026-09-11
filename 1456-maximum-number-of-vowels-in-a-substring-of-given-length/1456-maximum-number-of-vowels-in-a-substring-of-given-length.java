class Solution {
    public int maxVowels(String s, int k) {
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        int ans = 0;
        int j = 0;
        int i = 0;
        int vow = 0;
        while(j < s.length()){
            if(j - i + 1 > k)
            {
                if(set.contains(s.charAt(i)))
                vow --;
                i++;
            }

            if(set.contains(s.charAt(j)))
                vow ++;
            

            ans = Math.max(vow , ans);

            j++;

        }
        return ans;
    }
}