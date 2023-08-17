package javaDSA.Pattern;
import java.util.*;
public class Number_Pyramid {

    public static void Number_pyramid(int n ){
        for( int i =1; i<=n; i++){
            //spaces 
            for(int j=1 ; j<=n-i; j++){
                System.out.print(" ");
            }
            // stars
            //int counter =1;
            for (int j=1; j<=i; j++){
            
                System.out.print(i+" ");
                //counter+=1;

            }
            System.out.println();
        }
        
    }


    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        Number_pyramid(n);
        sc.close();


    }
    
}
