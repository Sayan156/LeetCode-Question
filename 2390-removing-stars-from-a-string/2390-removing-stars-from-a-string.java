class Solution {
    public String removeStars(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        StringBuffer sb = new StringBuffer();
        for(int i = 0 ;i<s.length();i++){
            if(s.charAt(i)=='*')
            stack.pop();
            else
            stack.push(s.charAt(i));
        }
        while(!stack.isEmpty()){
            sb.append(stack.removeLast());
        }
        return sb.toString();
        

        
    }
}