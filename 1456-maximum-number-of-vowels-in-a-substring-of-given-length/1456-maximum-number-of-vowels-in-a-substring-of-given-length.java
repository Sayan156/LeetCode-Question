class Solution {
    public int maxVowels(String s, int k) {
        int ans = 0;
        int i = 0;
        int j = 0;
        int vol_cnt = 0;
        while(j < s.length()){
            if(j - i + 1 > k){
    
            if(isVowel(s.charAt(i)))
            vol_cnt--;
            i++;
            }
            if(isVowel(s.charAt(j)))
            vol_cnt++;

            ans = Math.max(vol_cnt,ans);
            j++;
        }
        return ans;
        
    }
    public boolean isVowel(char c){
        return c == 'a' || c== 'e' || c== 'i' || c == 'o' || c=='u';
    }
}