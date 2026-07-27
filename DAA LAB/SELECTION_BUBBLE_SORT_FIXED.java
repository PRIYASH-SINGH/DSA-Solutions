//write a program for selection and bubble sort using function 
// also compare its no. of swap and comparisons 
//for the given array
import java.util.*;

public class SELECTION_BUBBLE_SORT_FIXED {
    
    static int[] selectionsort(int arr[]) {
        int comparisons = 0;
        int swaps = 0;
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                comparisons++;
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            if (min_idx != i) {
                int temp = arr[min_idx];
                arr[min_idx] = arr[i];
                arr[i] = temp;
                swaps++;
            }
        }
        System.out.println("Selection Sort - Comparisons: " + comparisons + ", Swaps: " + swaps);
        return arr;
    }

    static int[] bubblesort(int arr[]) {
        int comparisons = 0;
        int swaps = 0;
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                comparisons++;
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                }
            }
        }
        System.out.println("Bubble Sort - Comparisons: " + comparisons + ", Swaps: " + swaps);
        return arr;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the no. of elements : ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        
        int sorted[] = new int[n];
        System.out.print("CHOSSE WHICH SORTING TO APPLY ON THE ARRAY \n1.SELECTION SORT\n2.BUBBLE SORT >>> ");
        int choice = scan.nextInt();
        
        switch (choice) {
            case 1:
                sorted = selectionsort(arr);
                System.out.print("Sorted Array: ");
                for (int val : sorted) {
                    System.out.print(val + " ");
                }
                System.out.println();
                break;
            case 2:
                sorted = bubblesort(arr);
                System.out.print("Sorted Array: ");
                for (int val : sorted) {
                    System.out.print(val + " ");
                }
                System.out.println();
                break;
            default:
                System.out.println("INVALID CHOICE");
        }
        scan.close();
    }
}
