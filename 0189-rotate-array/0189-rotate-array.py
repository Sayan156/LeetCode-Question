class Solution:
    def swap_till(self, nums : list[int] , i : int , j : int) :
        while(i < j) :
            temp = nums[i]
            nums[i] = nums[j]
            nums[j] = temp
            i +=1
            j-=1


    def rotate(self, nums: list[int], k: int) -> None:
        k = k % len(nums)
        self.swap_till(nums,0 , len(nums) - 1)
        self.swap_till(nums,0,k-1)
        self.swap_till(nums,k,len(nums)-1)
        

        