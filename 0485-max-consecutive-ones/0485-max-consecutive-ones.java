class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int ones = 0;
        int ans = 0;
        for(int i = 0 ; i< arr.length ; i++){
            if(arr[i] == 0){
            ones = 0;
            
            }
            else{
            ones++;
            ans = Math.max(ans , ones);
            }
        }
        return ans;
        
    }
}