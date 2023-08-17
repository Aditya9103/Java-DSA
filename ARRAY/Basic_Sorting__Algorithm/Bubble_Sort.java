package javaDSA.ARRAY.Basic_Sorting__Algorithm;
import java.util.*;
public class Bubble_Sort {
    public static void Bubble_sort(int numbers[]){

        for (int turns=0; turns<numbers.length -1; turns++){
            for(int j=0; j<numbers.length - 1 -turns; j++){
                if ( numbers[j] > numbers[j+1]){
                    //swapp
                    int temp = numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1]=temp;

                }
            }

        }
    }
    public static void printArray(int numbers[]){
        for(int i = 0; i<numbers.length; i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();

    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of your array:");
        int n= sc.nextInt();
        int numbers[]=new int[n];
        
        System.out.println("Enter the array");
        for (int i=0; i<numbers.length; i++ ){
            numbers[i]= sc.nextInt();
        }
        //int numbers[]={5,4,1,3,2};
        Bubble_sort(numbers);
        printArray(numbers);
        sc.close();


    }
    
   
    
}
