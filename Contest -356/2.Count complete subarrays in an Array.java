//TimeComplexity = O(N^2)
//Space Complexity = O(2N)
class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int result = 0;
        HashSet ori = new HashSet<>();
        HashSet copy = new HashSet<>();
        for(int num : nums){
            ori.add(num);
        }
        for(int i=0; i<nums.length; i++){
            if(ori.isEmpty()){

                for(int j = i;j<nums.length;j++){
                    if(copy.contains(nums[j])){
                        ori.add(nums[j]);
                        copy.remove(nums[j]);
                    }
                    if(copy.isEmpty()) {
                        result += nums.length-j;
                        break;
                    }
                }

            }else if (copy.isEmpty()){

                for( int j = i;j<nums.length;j++){
                    if(ori.contains(nums[j])){
                        copy.add(nums[j]);
                        ori.remove(nums[j]);
                    }
                    if(ori.isEmpty()) {
                        result += nums.length-j;
                        break;
                    }
                }
            }
        }
        return result;
    }
}