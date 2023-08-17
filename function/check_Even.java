package javaDSA.function;
import java.util.*;

public class check_Even {
    public static boolean isEven(int num){
        if (num %2== 0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");

        int num = sc.nextInt();
        System.out.println(isEven(num));
        sc.close();
    }
    
}
