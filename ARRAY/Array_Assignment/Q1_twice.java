package javaDSA.ARRAY.Array_Assignment;
import java.util.*;
public class Q1_twice {
    public static boolean Twice_element(int num[]){
        for (int i=0; i<num.length; i++){
            for(int j=i+1; j<num.length; j++){
                if (num[i]==num[j]){
                    return true;
                }

            }
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of your array:");
        int n= sc.nextInt();
        int num[]=new int[n];
        
        System.out.println("Enter the array");
        for (int i=0; i<num.length; i++ ){
            num[i]= sc.nextInt();
        }
        System.out.println(Twice_element(num));
        sc.close();

    }
    
}
