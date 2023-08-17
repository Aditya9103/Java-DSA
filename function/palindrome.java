package javaDSA.function;
import java.util.*;

public class palindrome {
    public static boolean Palindrome(int n){
        int reverse=0;
        int temp=n;
        while(n>0){
            int r= n%10;
           
            reverse= reverse*10 + r;
            n = n / 10;           
        }
        if (reverse == temp){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        System.out.println(Palindrome(n));
        sc.close();
    }

    
}
