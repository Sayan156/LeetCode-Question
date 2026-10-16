class Solution {
    public String longestPalindrome(String s) {
        String ans = "";

        for (int i = 0; i < s.length(); i++) {
            // for odd length
            int l1 = i;
            int r1 = i;
            while (l1 > -1 && r1 < s.length()  && s.charAt(l1) == s.charAt(r1)) {
                
                int len = r1 - l1 + 1;
                if (len > ans.length()) {
                    ans = s.substring(l1, r1+1);
                }
                l1--;
                r1++;
            }
            //for even length
            if (i < s.length()) {
                int l2 = i;
                int r2 = i + 1;
                while (l2 > -1 && r2 < s.length()  && s.charAt(l2) == s.charAt(r2)) {

                    int len = r2 - l2 + 1;
                   
                    if (len > ans.length()) {
                        ans = s.substring(l2, r2+1);
                    }
                    l2--;
                    r2++;
                }
            }

        }
        return ans;
    }
}