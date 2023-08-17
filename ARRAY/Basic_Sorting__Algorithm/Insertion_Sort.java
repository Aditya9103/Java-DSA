package javaDSA.ARRAY.Basic_Sorting__Algorithm;
import java.util.*;
public class Insertion_Sort {
    public static void Insertion_sort(int arr[]){
        for(int i= 1; i<arr.length; i++){
            int curr=arr[i];
            int prev= i-1;
            while(prev >=0  && arr[prev]<curr){
                arr[prev+1]=arr[prev];
                prev --;
            }
            arr[prev+1]=curr;
        }
    }
    public static void printarr(int arr[]){
        for (int i= 0; i<arr.length;i++){
            System.out.println(arr[i]+" ");
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
        
        Insertion_sort(arr);
        printarr(arr);
        sc.close();  

    }

    
   

    
}
