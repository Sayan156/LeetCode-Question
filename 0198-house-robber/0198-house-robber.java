class Solution {
    int dp[];
    int solve(int[] num,int i){
        if(i>= num.length)
        return 0;
        if(dp[i] == Integer.MAX_VALUE){
        int money1 = num[i] + solve(num , i+2);
        int money2 = 0 + solve(num , i+1);
        dp[i] = Math.max(money1 , money2);
        }
        return dp[i];
        
    }
    public int rob(int[] nums) {
        dp = new int[nums.length+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
       return solve(nums,0);
               
    }
}