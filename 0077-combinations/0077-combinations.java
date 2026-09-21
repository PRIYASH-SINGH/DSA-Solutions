class Solution {
    public List<List<Integer>> combine(int n, int k) {
       List<Integer> list=new ArrayList<>();
       List<List<Integer>> Double=new ArrayList<>();
        solve(n,k,list,Double,1);
        return Double;
        
    }
     private static void solve(int n,int k,List<Integer> list,List<List<Integer>> Double,int start)
    {
        if(list.size()==k)
        {
            Double.add(new ArrayList<>(list));
            return;            
        }
        for(int i=start;i<=n;i++)
        {
            list.add(i);
            solve(n,k,list,Double,i+1);
            list.remove(list.size()-1);
            
        }
        
    }
}