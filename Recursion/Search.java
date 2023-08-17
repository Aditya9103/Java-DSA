package javaDSA.Recursion;

public class Search {
    public static int Occurence(int arr[],int key ,int i){
        if(arr.length==i){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return Occurence(arr ,key,i+1);
    }
    public static void main(String args[]){
        int arr[]={3,4,5,6,2};
        System.out.println(Occurence(arr,4,0));

    }
    
}
