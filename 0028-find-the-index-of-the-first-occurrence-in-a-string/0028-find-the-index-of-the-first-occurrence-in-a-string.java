class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.contains(needle)){
           int ans= haystack.indexOf(needle);
           return ans;

        }
        return -1;
    }
}