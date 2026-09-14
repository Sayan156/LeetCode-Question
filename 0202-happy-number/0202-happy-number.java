class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();
        int num = n;
        int sum = 0;
        while(true){
            if(num == 1)
            return true;
            if(seen.contains(num))
            return false;
            seen.add(num);

            while(num != 0){
                int dig = num %10;
                dig *= dig;
                sum += dig;
                num /= 10;
            }
            
           num = sum;
           sum = 0;           
        }   
        
    }
}