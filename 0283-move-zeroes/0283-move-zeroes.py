class Solution:
    def moveZeroes(self, arr: list[int]) -> None:
        i = 0
        j = 1
        while(j < len(arr)) :
            if(arr[i] == 0 and arr[j] != 0) :
                arr[i] , arr[j] = arr[j] , arr[i]
                i += 1
            elif(arr[j]==0 and arr[i] != 0) :
                i = j
            j+=1



        