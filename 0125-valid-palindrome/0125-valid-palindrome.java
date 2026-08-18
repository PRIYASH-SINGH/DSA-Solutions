class Solution {
    public boolean isPalindrome(String s) {
        String s1=s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuffer s2=new StringBuffer(s1);
        s2.reverse();
        if(s2.toString().equals(s1)){
            return true;
        }
        else{
            return false;
        }
   }
}