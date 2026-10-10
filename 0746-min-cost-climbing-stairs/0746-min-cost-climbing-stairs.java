class Solution {
    int[] dp;
    int solve(int[] cost , int i){
        if(i >= cost.length )
        return 0;
        if (dp[i] != -1) {
            return dp[i];
        }
        int ans1;
        int ans2;
        ans1 = cost[i]+solve(cost , i+1);
        ans2 = cost[i]+solve(cost , i+2);
        dp[i] = Math.min(ans1,ans2);
        
        return dp[i];

    }
    public int minCostClimbingStairs(int[] cost) {
        dp = new int[cost.length+1 ];
        Arrays.fill(dp, -1);
        return Math.min(solve(cost, 0), solve(cost, 1));
        
    }
}