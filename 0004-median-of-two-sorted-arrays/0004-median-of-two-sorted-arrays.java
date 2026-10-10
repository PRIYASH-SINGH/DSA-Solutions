class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
         List<Integer> Union=new ArrayList<>();

         int n1=nums1.length;
         int n2=nums2.length;
         int i=0;
         int j=0;
         while(i<n1 && j<n2){
            if(nums1[i]<=nums2[j]){
                    Union.add(nums1[i]);
                    i++;
                }
            
            else{
              
                    Union.add(nums2[j]);
                    j++;
            }
           }
        
        while(i<n1){ 
            Union.add(nums1[i]);
            i++;
        }
        while(j<n2){
            Union.add(nums2[j]);
            j++;
        }
         
         if(Union.size()%2==0){
            double median=(Union.get(Union.size()/2-1)+Union.get(Union.size()/2))/2.0;
                    return  median;
         }
         else {
            double median=Union.get(Union.size()/2);
                    return  median;
         }

    }
}