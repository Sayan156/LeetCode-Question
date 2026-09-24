class Solution:
    def canPlaceFlowers(self, flowerbed: list[int], k: int) -> bool:
        spot = 0
        n = len(flowerbed)
        if(n == 1) :
            if(flowerbed[0] == 0 and k <= 1) :
                return True
            if(flowerbed[0] == 1 and k == 0) :
                return True
            return False

        for i in range(0,len(flowerbed) ) :
            if(flowerbed[i] == 0 ) :
                if(i==0 ) :
                    if(flowerbed[i+1] == 0) :
                        flowerbed[i] = 1
                        spot+=1
                elif(i == n - 1 ) :
                    if(flowerbed[i - 1] == 0) :
                        flowerbed[i] = 1
                        spot+=1
                else :
                    if(flowerbed[i+1] == 0 and flowerbed[i - 1] == 0) :
                        flowerbed[i] = 1
                        spot+=1



      
        return spot >= k
    

        