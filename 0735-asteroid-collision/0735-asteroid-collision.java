class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> stack = new ArrayDeque<>();
        int[] ans;
        for(int num : asteroids){
            if(stack.isEmpty()){
                    stack.push(num);
            }
            else{
            while(true){
                
                if(stack.isEmpty() || stack.peek() * num > 0 || (num>0 && stack.peek()<0)){
                    stack.push(num);
                    break;
                }
                else if(Math.abs(num) >= Math.abs(stack.peek())){
                    int del = stack.pop();
                    if(Math.abs(num) == Math.abs(del))
                    break; 
                }
                else{
                    
                    break;
                }

            }
            }
        }
        ans = new int[stack.size()];
        for(int i = 0 ; i<ans.length ; i++){
            ans[i] = stack.removeLast();
        }
        return ans;
        
    }
}