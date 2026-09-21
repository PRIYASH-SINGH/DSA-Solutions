class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> list=new ArrayList<>();
        List<List<Integer>> dlist=new ArrayList<>();
        Arrays.sort(candidates);
        solve(candidates,target,list,dlist,0);
          return dlist;
    }
    private static void solve(int[] candidates,int target , List<Integer> list,List<List<Integer>> dlist,int index){
        if(target==0){
            dlist.add(new ArrayList<>(list));
            return;
        }
        for(int i=index;i<candidates.length;i++){
            if(i>index && candidates[i] == candidates[i-1]){
                continue;
            }
            if(target>=candidates[i]){
                list.add(candidates[i]);
                solve(candidates,target-candidates[i],list,dlist,i+1);
                list.remove(list.size()-1);
            }
        }
    }
}