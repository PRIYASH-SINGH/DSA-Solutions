class Solution {
    public int[] runningSum(int[] nums) {
        int n=nums.length;
        int j=0;
        int running_sum[]=new int[n+1];
        int sums[]=new int[n];
        for(int i=0;i<nums.length;i++){
            sums[i]=nums[i]+running_sum[i];
            running_sum[i+1]=sums[i];   
        }
        return sums;
    }
}