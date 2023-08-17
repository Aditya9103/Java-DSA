package javaDSA.ARRAY.Basic_Sorting__Algorithm;

public class Insertion_Sort_Decresing {
    public static void Insertion(int arr[]){
        for (int i=1; i<arr.length; i++){
            int temp= arr[i];
            int j=i-1;
            while(j>=0 && arr[j]< temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;

        }
    }
    public static void printarr(int arr[]){
        for (int i= 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[]={5,-4,-1,3,2};
        Insertion(arr);
        printarr(arr);
    }
    
}
