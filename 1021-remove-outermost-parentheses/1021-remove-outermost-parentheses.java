class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int j = 0;
        int a = 0; // count of (
        int b = 0; // count of )
        while(j < s.length()){
            if(s.charAt(j) == '(')
            a++;
            if(s.charAt(j) == ')')
            b++;
            if( a == b){
                sb.append(s.substring(i+1 , j));
                i = j + 1;
                a = 0;
                b = 0;
            }
            j++;
            

        }
        return sb.toString();

        
    }
}