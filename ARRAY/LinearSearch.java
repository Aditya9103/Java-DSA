package javaDSA.ARRAY;
import java.util.*;
public class LinearSearch {
    public static int Linearsearch(int numbers[] ,int key) {

        for (int i=0; i<numbers.length; i++){
            if (numbers[i]==key){
                return i;

            }
        }
        return -1;
    
    }
    public static void main(String args[]){
        int numbers[]=new int [10];

        Scanner sc = new Scanner(System.in);
        for (int i=0; i<10; i++){
            numbers[i]=sc.nextInt();
        }
        System.out.print("Eneter the :");
        int key= sc.nextInt();
        //int numbers[]={2,4,6,8,10,12,14,16};
        //int key= 10;
        int index = Linearsearch(numbers,key);
        if (index == -1){
            System.out.println("Not Found");

        }
        else{
            System.out.println("Key is at index: "+index);
        }
        sc.close();

    }
    
}
