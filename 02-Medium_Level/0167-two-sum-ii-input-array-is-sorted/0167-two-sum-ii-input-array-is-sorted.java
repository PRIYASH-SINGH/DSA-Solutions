class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l=0;
        int r=numbers.length-1;
        while(l<r){
            int k=numbers[l]+numbers[r];
            if(k==target){
                int[] result={l+1,r+1};
                return result;
            }
            else if(k<target){
                l++;
            }else{
                r--;
            }
        }
        return numbers;
    }
}