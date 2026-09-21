class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) 
    {
        List<Integer> list=new ArrayList<>();
        List<List<Integer>> Double=new ArrayList<>();
        solve(candidates,target,list,Double,0);
        return Double;
    }
    private static void solve(int[] candidates,int target,List<Integer> list,List<List<Integer>> Double,int index){
        if(target==0){
            Double.add(new ArrayList<>(list));
            return;
        }
        for(int i=index;i<candidates.length;i++){
            if(target>=candidates[i]){
                list.add(candidates[i]);
                solve(candidates,target-candidates[i],list,Double,i);
                list.remove(list.size()-1);
            }
        }

    }
}