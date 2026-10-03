class Solution {;
    
    int[][] dp;
    int INF = 1000000;
    int solve(int[] coins , int amount , int i){   
        if(i == 0){
            int temp = amount%coins[i];
            if(temp == 0)
            return amount/coins[i];
            else
            return INF;
        }
        if(dp[i][amount]  == Integer.MAX_VALUE){
        int not_take = 0 + solve(coins,amount, i - 1);
        int take = INF;
        if(coins[i]<=amount)
        take = 1 + solve(coins , amount - coins[i],i);
        dp[i][amount] = Math.min(take , not_take);
        
        }
        return dp[i][amount];

    }
     int coinChange(int[] coins, int amount) {
       dp = new int[coins.length + 1][amount+1];
       for (int i = 0; i < dp.length; i++) {
        Arrays.fill(dp[i], Integer.MAX_VALUE);
        }
        int ans = solve(coins,amount,coins.length-1);
        if(ans == INF)
        return -1;
        return ans;
    }
}