class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int sums=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
           sums=Math.max(nums[i],sums+nums[i]);
           maxsum=Math.max(maxsum,sums);
        }
        return maxsum;
    }
}