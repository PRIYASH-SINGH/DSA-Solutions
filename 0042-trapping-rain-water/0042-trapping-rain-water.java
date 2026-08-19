class Solution {
    public int trap(int[] arr) {
       int left[]=new int[arr.length];//created a left array
       left[0]=arr[0];//initialze it from start
       for(int i=1;i<arr.length;i++){
        left[i]=Math.max(left[i-1],arr[i]);//stores max height of left side
       }
       int right[]=new int[arr.length];
       right[right.length-1]=arr[arr.length-1];//stores max height of right side
       for(int i=arr.length-2;i>=0;i--){
        right[i]=Math.max(right[i+1],arr[i]);//stores max height of right side
       }
       int trapwater=0;
       for(int i=0;i<arr.length;i++){
        trapwater+=Math.min(left[i],right[i])-arr[i];
       }
       return trapwater;

    }
}
