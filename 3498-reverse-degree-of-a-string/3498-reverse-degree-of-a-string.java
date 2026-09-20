class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        int i = 1;
        for (char c : s.toCharArray()){
            int temp =  c - 'a';
            temp = 26 - temp ;
            temp *= i++;
            sum += temp;
        }
        return sum;
        
    }
}