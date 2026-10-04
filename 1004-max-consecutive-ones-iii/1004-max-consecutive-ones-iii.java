class Solution {
    public int longestOnes(int[] nums, int k) {
        int lptr=0;
        int zeros=0;
        int maxsize=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zeros++;
            }
            while(zeros>k){
            if(nums[lptr]==0){
                zeros--;
            }
            lptr++;
        }
        maxsize=Math.max(maxsize,i-lptr+1);


        }
        return maxsize;
        
    }
}