public class Solution {
    public void merge_sort(int[] arr , int i , int j){
        
        int mid = i +(j-i)/2;
        if(i == j){
            return ;
        }
         merge_sort(arr,i,mid);
         merge_sort(arr,mid+1,j);
        int x = i;
        int y = mid+1;
        int n = mid - i + 1;
        int m = j - mid + 1;
       int[] temp = new int[j-i+1];
        int k = 0;
        while(x <= mid && y<= j){
            if(arr[x] < arr[y] ){
            temp[k++] = arr[x++];    
            }
            else{
                temp[k++] = arr[y++];
            }       

        }

        while(x<= mid)
        temp[k++] = arr[x++];
        

        while(y<=j)
        temp[k++] = arr[y++];

        for(int p = 0 ; p< (j-i+1) ; p++){
            arr[i+p] = temp[p];
        }

        
    }
    public int[] sortArray(int[] nums) {
        int i = 0;
        int j = nums.length;
         merge_sort(nums,i,j-1);
         return nums;

        
    }
}