class Solution {
    public int[][] merge(int[][] arr) {
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        ArrayList<int[]> ans = new ArrayList<>();
        ans.add(arr[0]);
        
        for(int i = 1 ; i<arr.length ; i++){
            int p = ans.size() - 1;
            if( arr[i][0]<=ans.get(p)[1]){
            ans.set(p , new int[]{ans.get(p)[0], Math.max(arr[i][1],ans.get(p)[1])});
            }
            else
            ans.add(arr[i]);
        }
        int[][] ans_arr = new int[ans.size()][2];
        for(int i = 0 ; i<ans.size() ; i++){
            
            ans_arr[i] = ans.get(i);
        }
        return ans_arr;
    }
}