//write a program for selection and bubble sort using function 
// also compare its no. of swap and comparisons 
//for the given array
import java.util.*;
public class SELECTION_BUBBLE_SORT {
         static int[] selectionsort(int arr[]){
            int comparisons=0;
            int swaps=0;
            for(int i=0;i<arr.length-1;i++){
             int min=arr[i];
             int loc=i;
             for(int j=i+1;j<arr.length;j++)
                {comparisons++;
                    if(min>arr[j]){
                    min=arr[j];
                    loc=j;
                }
            }
            if(loc!=i){
                int  temp=arr[i];
                arr[i]=arr[loc];
                arr[loc]=temp;
                swaps++;
            }
        }
        System.out.println("SELECTION SORT >>>\nNO. OF COMPARISONS = "+comparisons);
        System.out.println("NO. OF SWAPS = "+swaps);
        return arr;
    }
         static int[] bubblesort(int arr[]){
            int comparisons=0;
            int swaps=0;
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr.length-i-1;j++){
                comparisons++;
                    if(arr[j]>arr[j+1]){
                        int temp=arr[j+1];
                        arr[j+1]=arr[j];
                        arr[j]=temp;
                    swaps++;
                }
            }
        }
        System.out.println("BUBBLE SORT >>>\nNO. OF COMPARISONS = "+comparisons);
        System.out.println("NO. OF SWAPS = "+swaps);
        return arr;
         }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the no. of elements : ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements : ");
        for(int i = 0; i<n; i++){
            arr[i] = scan.nextInt();
        }
        int sorted[]=new int[n];
        System.out.print("CHOSSE WHICH SORTING TO APPLY ON THE ARRAY \n1.SELECTION SORT\n2.BUBBLE SORT >>>");
        int choice = scan.nextInt();
        switch(choice){
            case 1:
                sorted=selectionsort(arr.clone());
                break;
            case 2:
                sorted=bubblesort(arr.clone());
                break;
            default:
                System.out.println("INVALID CHOICE");
        }
        System.out.println("THE SORTED ARRAY IS : "+Arrays.toString(sorted));
    }

}