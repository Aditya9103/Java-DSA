package javaDSA.ARRAY.Basic_Sorting__Algorithm;
import java.util.*;
public class Selection_Sort {
    public static void Selectioin_sort(int arr[]){
        int minPos=0;
        for(int i= 0; i<= arr.length -2; i++){
            for(int j=i+1; j<=arr.length -1; j++){
                if (arr[minPos] > arr[j]){
                    minPos=j;    
                }

            }
            // swapp
            int temp = arr[minPos];
            arr[minPos]=arr[i];
            arr[i] = temp;
        }
        
    }
    public static void printarr(int arr[]){
        for (int i= 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of your array:");
        int n= sc.nextInt();
        int arr[]=new int[n];
        
        System.out.println("Enter the array");
        for (int i=0; i<arr.length; i++ ){
            arr[i]= sc.nextInt();
        }
        Selectioin_sort(arr);
        printarr(arr);
        
        sc.close();  

    }

    
}
