package javaDSA.function;
import java.util.*;
public class sum_of_Digit {

    public static int  Digit_sum(int n){
        int sum =0;
        while( n>0){
            int r = n%10;
            n= n/10;
            sum+=r;

        }
        return sum;


    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = sc.nextInt();
        System.out.println(Digit_sum(n));
        sc.close();

        


    }
    
}
