import java.util.*;

public class TwoSum{
    public static void main (String args[]){
        // scaanner for input size , values and target
        Scanner scan=new Scanner(System.in);
        System.out.println("ENTER SIZE OF ARRAY : ");
        int n=scan.nextInt();
        
        int arr[]=new int[n];
       
        System.out.println("ENTER ARRAY VALUES");
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }

        // setting flags false for breaking loop
        boolean flag=false;
        System.out.println("ENTER THE TARGET VALUE");
        int m=scan.nextInt();

        for(int i=0;i<n;i++){
            int p=m-arr[i]; 
            //subtracting each indices from  target value to  match with other indices
            for(int j=i+1;j<n;j++)
            // inner looping from i+1 index from tthe current outer loop to stop dupliation
            {
                if(p==arr[j]){   
                    System.out.print(i+" "+j);
                    flag=true;
                    break; // breaks the loops
                }
             }
            
            }
            if(!flag){
                    System.out.print("NO PAIRS");
            
        }
        scan.close();
    }
}
