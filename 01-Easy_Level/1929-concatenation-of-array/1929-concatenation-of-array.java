class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=2*nums.length;
        int ans[]=new int[n];
        int i=0;
        int j=0;
        for(i=0;i<n;i++){
            if(i<nums.length)
            {
                ans[i]=nums[i];
        }else{
            ans[i]=nums[j];
            j++;
        }
    }
    return ans;
}
}