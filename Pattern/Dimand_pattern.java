package javaDSA.Pattern;
import java.util.*;
public class Dimand_pattern {

    public static void Diamond_Pattern(int n){
        // upper half
        for ( int i = 1; i<=n; i++){
            // spaces
            for (int j =1; j<= (n-i) ; j++){
                System.out.print(" ");
            }
            // stars
            for (int j =1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();

        }
        
        // lower half
        for (int i =n ; i>=1; i--){
            // spaces 
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // stars
            for (int j =1; j<=(2*i)-1; j++){
                System.out.print("*");

            }
            System.out.println();
        }
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        Diamond_Pattern(n);
        sc.close();
        



    }
    
}
