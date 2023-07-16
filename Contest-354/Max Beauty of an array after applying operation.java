//Time Complexity = O(NlogN) + O(N)
//Space Complexity = O(1)
class Solution {
    public int maximumBeauty(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length -1;
        int max = 0;
        for(int i =0; i< nums.length ; i++){
            for(int j = i ; j < nums.length ; j++){
                if(nums[i] + 2*k <= nums[j]) {
                    // max = Math.max(max,j-i+1);

                    j++;}
                else{
                    max = Math.max(max,j-i+1);
                }
            }
        }
        return max;
    }
}