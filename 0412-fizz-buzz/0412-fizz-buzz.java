class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>();
        for(int i = 0 ; i< n;i++){
            int idx = i+1;
            if(idx % 3 == 0 && idx % 5 == 0){
                ans.add("FizzBuzz");
            }
            else if(idx % 3 == 0){
                ans.add("Fizz");
            }
            else if(idx % 5 == 0){
                ans.add("Buzz");

            }
            else
            ans.add(idx+"");
        }
        return ans;
        
    }
}