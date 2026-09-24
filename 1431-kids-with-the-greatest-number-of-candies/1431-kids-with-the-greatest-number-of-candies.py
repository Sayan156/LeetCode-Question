class Solution:
    def kidsWithCandies(self, candies: list[int], extraCandies: int) -> list[bool]:
        ans = []
        max_candies = float('-inf')
        for i in candies :
            max_candies = max(i , max_candies)
        for i in range(len(candies)) :
            if(candies[i] + extraCandies >= max_candies) :
                ans.append(True)
            else :
                ans.append(False)
        return ans
        