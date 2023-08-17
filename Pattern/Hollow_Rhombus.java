package javaDSA.Pattern;
import java.util.*;
public class Hollow_Rhombus {

    public static void Hollow_rhombus(int n ){
        for (int i=1; i<=n; i++){
            // spaces
            for (int j =1; j<=(n-i); j++){
                System.out.print(" ");

            }
            // hollow rectangle
            for (int j=1; j<=n; j++){
                if (i==1 || i==n|| j==1 || j== n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
          
            
        
        }
    }


    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number");
        int n= sc.nextInt();
        Hollow_rhombus(n);
        sc.close();


    }
    
}
