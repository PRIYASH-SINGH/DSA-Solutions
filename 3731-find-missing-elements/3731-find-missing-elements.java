class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int max=nums[0];
        int min=nums[0];
        HashSet<Integer> Set=new HashSet<>();
        for(int num:nums){
            min=Math.min(min,num);
            max=Math.max(max,num);
            Set.add(num);
        }
        List<Integer> Missing=new ArrayList<>();
        for(int i=min;i<=max;i++){
            if(!Set.contains(i)){
                Missing.add(i);
            }
        }
        return Missing;
}
}