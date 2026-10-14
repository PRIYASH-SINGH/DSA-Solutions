class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        for(String s:operations){
            if(s.equals("+")){
                int temp=st.pop();
                int newtop=st.peek()+temp;
                st.push(temp);
                st.push(newtop);
                
            }
            else if(s.equals("D")){
                st.push(2*st.peek());
            }
            else if(s.equals("C")){
                  st.pop();
            }
            else{
                st.push(Integer.parseInt(s));
            }
        }
        int totalsum=0;
        for(int socre:st){
            totalsum+=socre;
        }
        return totalsum;
    }
}