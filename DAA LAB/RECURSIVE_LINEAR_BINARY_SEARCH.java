import java.util.*;

public class RECURSIVE_LINEAR_BINARY_SEARCH {
   static int arr[]=new int[101];
 static int LinearSearch(int index,int n,int key)
  {
    if(index>n){
        return -1;
    }
    if(arr[index]==key){
        return index;
    }
    return LinearSearch(index+1,n,key);
  }

 static int BinarySearch(int low,int high,int key){
   
    if(low>high){
        return -1;
    }
    int mid=(low+high)/2;
    if(arr[mid]==key){
        return mid;
    }
    else if(key<arr[mid]){
        return BinarySearch(low,mid-1,key); }
    else{
       return BinarySearch(mid+1,high,key);
    }

 }
    public static void main (String args[])         {
        Scanner scan = new Scanner(System.in);
        System.out.print("WELCOME !!! THIS IS A RECURSIVE LINEAR / BINARY SEARCH PROGRAM \nENTER SIZE OF ARRAY >>>");
        int result;
        int n=scan.nextInt();

        for(int i=1;i<=n;i++){
            System.out.print("ENTER VALUE AT INDEX "+i+" >>> ");
            arr[i]=scan.nextInt();
        }
        System.out.print("Enter value to search >>> ");
        int key=scan.nextInt();
        System.out.print("SELECT WHICH SEARCH TO RUN 1.LINEAR SEARCH 2.BINARY SEARCH >>>"); 
        int choice = scan.nextInt();
        switch(choice){
            case 1: result =LinearSearch(1,n,key);
                    break;
            case 2: Arrays.sort(arr,1,n+1);
             System.out.println("Array Sorted Automatically for Binary Search !!!");
    
                    result =BinarySearch(1,n,key);
                    break;
            default :System.out.print("Invalid Choice !!!");

            return;

        }
        if(result==-1){
            System.out.println("ELEMENT NOT FOUND !!!"); }
            else {
                System.out.println("ELEMENT FOUND "+key+" AT "+result);
        }
                scan.close(); 
            }
}
