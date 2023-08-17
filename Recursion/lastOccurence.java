package javaDSA.Recursion;

public class lastOccurence {
    public static int LastOccurence(int arr[],int key,int i){
        if(arr.length==i){
            return -1;
        }
        int isFound=LastOccurence(arr,key,i+1);
        if(isFound==-1 && arr[i]==key){
            return i;
        }
        return isFound;
    }
    public static void main(String args[]){
        int arr[]={2,3,6,3,5,3,8};
        System.out.println(LastOccurence(arr,3,0));

    }
    
}
