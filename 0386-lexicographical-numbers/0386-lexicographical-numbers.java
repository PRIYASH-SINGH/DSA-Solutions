class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> result=new ArrayList<>();
      for(int i=1;i<10;i++){
        solve(n,i,result);
      }   
      return result;
    }
    public void solve(int n,int ans,List<Integer> result){
        if(ans>n){
            return;
        }
        result.add(ans);
        for(int i=0;i<10;i++){
            solve(n,ans*10+i,result);
        }
    }
}