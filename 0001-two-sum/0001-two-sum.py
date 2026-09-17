class Solution:
    def twoSum(self, nums: list[int], target: int) -> list[int]:
        ans=[-1,-1]
        dict={}
        for i in range(len(nums)):
            key = target - nums[i]
            if key in dict:
                ans[0] = dict.get(key)
                ans[1] = i
                return ans
            dict[nums[i]] = i
        return ans        
        
