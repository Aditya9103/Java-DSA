package javaDSA.Pattern;
import java.util.*;
public class Inverted_Roted_Half_Pyramid {

    public static void IRHP(int n){
        for (int i = 1; i<=n; i++){
            // for spaces
            for (int j= 1; j<=n-i; j++){
                System.out.print(" ");
            }
            //for stars
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of lines:");
        int n = sc.nextInt();
        IRHP(n);
        sc.close();


    }
    
    
}
