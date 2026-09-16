class Solution {
      String[] arr={" "," ","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digit) {
        List<String> ans=new ArrayList<>();
        if(digit.length()==0){
            return ans;
        }
        printing(digit,"",ans);
        return ans;
    
    
    }
     public void printing(String digit,String s,List<String> ans)// digit = 23 , ans=" "
    {
        if(digit.length()==0)//2!=0
            {
             ans.add(s);
            return;
        }
        char ch=digit.charAt(0);//for 23 first it take 2
        String key=arr[ch-48];//it will give key "abc" because ascii value of 2 is 50 and 48 is the ascii value of 0
        for(int i=0;i<key.length();i++)
            {
            printing(digit.substring(1),s+key.charAt(i),ans);
            //for i=0 it will call printing("3","a") and for i=1 it will call printing("3","b")
        }
    }
    
}