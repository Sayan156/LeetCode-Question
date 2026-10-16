class Solution {
    int[][] dp;
    int INF = 100_000_00;
    
    int solve(int[] coins , int amount , int i ,int total){
        
        if(amount == total){
        return 0;
        }
        if(i >= coins.length)
        {
            return INF;
        }
        if(total > amount ){
         
         return INF;
        }
        
        
        if(dp[i][total] == Integer.MAX_VALUE){
        int take = INF;
        if(coins[i]<=amount-total){
        take = 1 + solve( coins , amount , i , total + coins[i] );
        }
        int not_take = solve(coins , amount , i + 1 , total);
        dp[i][total] = Math.min(take , not_take);
        }
        return dp[i][total];

    }
    public int coinChange(int[] coins, int amount) {
        dp = new int[coins.length + 1][amount + 1];
        for(int i = 0 ; i<dp.length;i++)
        Arrays.fill(dp[i] , Integer.MAX_VALUE);
        if(solve(coins, amount,0,0) >= INF )
        return -1;
        return solve(coins, amount,0,0);
    }
}