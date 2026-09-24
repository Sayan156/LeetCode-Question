class Solution:
    def MergeSort(self , arr:list[int],i : int , j : int) :
        if(i == j) :
            return
        mid = i + (j - i)//2
        self.MergeSort(arr , i , mid )
        self.MergeSort(arr,mid+1 , j)
        temp = []
        x = i
        y = mid + 1
        while (x <= mid and y <= j ) :
            if(arr[x] < arr[y]) :
                temp.append(arr[x])
                x+=1
            else :
                temp.append(arr[y])
                y+=1
        while (x <= mid) :
            temp.append(arr[x])
            x+=1
        while (y <= j) :
            temp.append(arr[y])
            y+=1
        for k in range(len(temp)) :
            arr[i+k] = temp[k]
        
    def sortArray(self, nums: list[int]) -> list[int]:
        self.MergeSort( nums , 0 , len(nums) - 1)
        return nums
    