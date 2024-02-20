//TC: O(N^2)
//SC: O(1)
class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        // Arrays.sort(words);
        int count =0;
        for(int i =0; i < words.length-1; i++){
            for(int j = i+1; j < words.length; j++){
                if(isPrefixSuffix(words[i],words[j]))count++;
            }
        }
        return count;
    }
    private boolean isPrefixSuffix(String t, String s){
        // if(s.length() < t.length()){
        //     String temp = s;
        //     s= t;
        //     t = temp;
        // }
        if(t.length() > s.length())return false;
        for(int i =0; i< t.length(); i++){
            if(t.charAt(i) != s.charAt(i))return false;
            if(t.charAt(t.length()-i-1) != s.charAt(s.length() - i-1))return false;
        }
        return true;
    }
}