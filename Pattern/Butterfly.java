package javaDSA.Pattern;
import java.util.*;
public class Butterfly {
    public static void butterfly( int n){
        // upper half
        for (int i =1; i<=n; i++){
            // star 1 st part
            for (int j=1; j<=i; j++){
                System.out.print("*");

            }
            // spaces
            int spaces = 2*(n-i);
            for( int j =1; j<=spaces ; j++){
                System.out.print(" ");

            }
            //star 2 nd half
            for (int j=1; j<=i; j++){
                System.out.print("*");

            }
            System.out.println();
        }
        //lower half
        for (int i =n; i>=1; i--){
            //stars 1st part
            for (int j= 1; j<=i ; j++){
                System.out.print("*");
            }
            // spaces
            int spaces = 2*(n-i);
            for( int j =1; j<=spaces; j++){
                System.out.print(" ");

            }
            //star 2 nd half
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    

    public static void main(String args []){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number");
        int n = sc.nextInt();
        butterfly(n);
        sc.close();


    }

}
