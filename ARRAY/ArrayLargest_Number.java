package javaDSA.ARRAY;
import java.util.*;
public class ArrayLargest_Number {

    public static int Largest_Number(int numbers[]){
        int Largest= Integer.MIN_VALUE; // - infinity
        int Smallest= Integer.MAX_VALUE;
        for (int i=0; i<numbers.length;  i++){
            if (Largest < numbers[i]){
                Largest = numbers[i];
                
            }
            if (Smallest > numbers[i]){
                Smallest = numbers[i];
            }
        }
        System.out.println("Smallest number is :"+numbers);
        return Largest;
        




    }


    public static void main(String args[]){
        int numbers[]= new int [10];
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<numbers.length; i++ ){
            numbers[i]= sc.nextInt();
        }
        //System.out.println("Largest value is:");
        Largest_Number(numbers);
        sc.close();

    }
    
}
