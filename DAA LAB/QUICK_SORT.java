//explain each line of the code with comments 

import java.util.*;
public class QUICK_SORT {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the no. of elements : ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements : ");
        for(int i = 0; i<n; i++){
            arr[i] = scan.nextInt();
        }
        quickSort(arr, 0, n-1);//calls the quick sort function 
        System.out.println("Sorted array: " + java.util.Arrays.toString(arr));
        scan.close();
    }
    static void quickSort(int arr[],int low,int high){//this function sorts the array
        if(low<high){//base case 
            int pi = partition(arr,low,high); 
            quickSort(arr,low,pi-1); //recursive call for the left part
            quickSort(arr,pi+1,high); //recursive call for the right part
        }
    }
    static int partition(int arr[],int low,int high){ //this function partitions the array in such a way that all elements smaller than the 
    //pivot are to its left and all elements greater than the pivot are to its right
        int pivot = arr[high]; //the pivot is the last element 
        int i = low-1; //i is the index of the smaller element
        for(int j = low;j<high;j++){ //j is the index of the current element
            if(arr[j]<=pivot){ //if the current element is smaller than the pivot
                i++; //increment the index of the smaller element
                int temp = arr[i]; //swap the smaller element with the element at index i
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }
}
