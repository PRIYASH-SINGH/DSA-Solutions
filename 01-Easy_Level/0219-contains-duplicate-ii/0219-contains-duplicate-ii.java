class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
          HashMap<Integer,Integer> map=new HashMap<Integer,Integer>(); //initiazlizng hashmap
            for(int j=0;j<nums.length;j++)// running for loop from 0 to n-1
            {
                if(map.containsKey(nums[j]) && j-map.get(nums[j]) <= k)
                {
                    return true;
                }
                map.put(nums[j],j);
            }
        
       return false;
    }
}