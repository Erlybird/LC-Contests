//Time complexity = O(N)
//Space Complexity = O(N)
class Solution {
    int n;
    int count;
    int x;
    public int minimumIndex(List<Integer> nums) {
        n = nums.size();
        count = 0;
        x = nums.get(0);

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i< n ; i++){
            map.put(nums.get(i),map.getOrDefault(nums.get(i),0)+1);
            if(map.get(nums.get(i)) > count){
                x = nums.get(i);
                count = map.get(nums.get(i));
            }

        }
        // System.out.println(x + " " + count);
        int freq = 0;
        if(count <= n/2)return -1;
        for(int i = 0; i < n-1 ; i++){
            // System.out.println(freq);

            if(nums.get(i) == x){
                freq++;
                if(validsplit(nums,freq,i))return i;
                // System.out.println(i + " " + freq + " " + 1);
            }
            // return -1;
        }
        return -1;

    }

    private boolean validsplit(List<Integer> nums,int freq, int i){
        if(freq > (i+1)/2 && (count - freq) > (n-i-1)/2)return true;
        return false;
    }
}