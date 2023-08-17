package javaDSA.Pattern;
import java.util.*;
public class Palindromic_Pattern {

    public static void Palindromic_pattern(int n ){
        for (int i=1; i<=n; i++ ){
            // spaces
            for (int j =1; j<=n-i; j ++){
                System.out.print(" ");
            }
            // numbers
            // decending
            
            for (int j=i ; j >=1; j--){
                System.out.print(j);


            }
            //assending
            for (int j = 2; j<= i; j++){
                System.out.print(j);
            }
            System.out.println();

        }
    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Inter the number:");
        int n = sc.nextInt();
        Palindromic_pattern(n);
        sc.close();

    }

}
    

