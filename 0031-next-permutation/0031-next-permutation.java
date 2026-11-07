class Solution {
    public void nextPermutation(int[] nums) {
        // find the index from where decending sequence stops
        // find the immidiate smallest element of that from right side
        //swap it with the element of the pivot index
        // reverse all the elements right side of the pivot
        int pivot = -1;
        int j = nums.length - 1;
        int p_num = 0;
        while(j>0){
            if(nums[j]>nums[j-1]){
            pivot = j-1;
            p_num = nums[pivot];
            break;
            }
            j--;
        }
        if(pivot > -1){
        int next_num = pivot+1;
        for(int i = pivot ; i<nums.length ; i++){
            if(nums[i] > p_num && nums[i]<=nums[next_num])
            next_num = i;
        }
        int temp = nums[next_num];
        nums[next_num] = nums[pivot];
        nums[pivot] = temp;
        
        }
        pivot+=1;
        j = nums.length - 1;
        while(pivot <= j){
            int temp = nums[pivot];
            nums[pivot] = nums[j];
            nums[j] = temp;
            pivot++;
            j--;

        }
        
    }
}