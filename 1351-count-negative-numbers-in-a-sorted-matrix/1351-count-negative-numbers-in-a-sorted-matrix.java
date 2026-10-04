class Solution {
    public int countNegatives(int[][] grid) {
        int neg = 0;
        for(int i = 0 ; i<grid.length ; i++){
           
                // find the 1st negetive by binary search
                int lo = 0;
                int hi = grid[i].length - 1;
                int mid = -1;
                while(lo <= hi){
                     mid = lo + (hi - lo)/2;
                    if(grid[i][mid] >= 0)
                    lo = mid + 1;
                    else
                    hi = mid-1;
                }
                if(lo < grid[i].length && grid[i][lo]<0)
                neg+= grid[i].length - lo;
            
        }
        return neg;
        
    }
}