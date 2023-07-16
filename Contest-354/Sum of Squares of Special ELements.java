//Time Complexity = O(N)
// Space COmplexity = O(1)
class Solution {
    public int sumOfSquares(int[] nums) {
        int result = 0;
        //base
        if(nums.length == 0) return 0;
        //logic
        int n = nums.length;
        for(int i = 1 ; i < n+1 ; i++){
            if(n%i==0){
                result += nums[i-1]*nums[i-1];
            }
        }
        return result;
    }
}