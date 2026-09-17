class Solution:
    def maxProfit(self, arr: list[int]) -> int:
        buy = arr[0]
        sell = 0
        profit = 0
        for i in range(len(arr)):
            temp_pro = arr[i] - buy
            buy = min(buy,arr[i])
            profit = max(temp_pro, profit)
        return profit

        