class Solution {
    public void moveZeroes(int[] nums) {
        int inserpos=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[inserpos]=nums[i];
                inserpos++;
            } 
            }
            while(inserpos<nums.length){
                nums[inserpos]=0;
                inserpos++;
            }
    }
}