class Solution {
    public int minEatingSpeed(int[] arr, int h) {
           int low=1;
           int high=0;
           for(int a: arr){
            high=Math.max(a,high);
           }
           int ans=0;
           while(low<=high){
            int mid=low+(high-low)/2;
            if(canFinish(mid,arr,h)==true){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
           }
           return ans;
    }
    private static boolean canFinish(int speed,int[] arr,int h){
        long totaltime=0;
        for(int i=0;i<arr.length;i++){
            long time=arr[i]/speed;
            if(arr[i]% speed !=0){
                time=time+1;
            }
            totaltime+=time;
        }
        if(totaltime<=h)
           return true;
        return false;
    }
}