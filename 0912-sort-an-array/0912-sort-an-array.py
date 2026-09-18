class Solution:
    def merge_sort(self, arr: list[int],low : int , high : int):
        mid = low + (high - low)//2
        if low == high :
            return
        self.merge_sort(arr,low , mid)
        self.merge_sort(arr,mid+1,high)
        temp = []
        i = low
        j = mid+1
        while(i <= mid and j<= high):
            if(arr[i] < arr[j]) :
                temp.append(arr[i])
                i+=1
            else :
                temp.append(arr[j])
                j+=1
        while(i<=mid) :
            temp.append(arr[i])
            i+=1
        while(j<=high) :
            temp.append(arr[j])
            j+=1
        
        for k in range(0,len(temp)):
            arr[low+k] = temp[k]
            


         
    def sortArray(self, nums: list[int]) -> list[int]:
        self.merge_sort(nums,0,len(nums) - 1)
        return nums
        