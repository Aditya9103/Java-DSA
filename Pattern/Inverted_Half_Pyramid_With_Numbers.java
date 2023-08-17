package javaDSA.Pattern;
import java.util.*;
public class Inverted_Half_Pyramid_With_Numbers {

    public static void IHPWN(int n){
        for (int i=1; i<=n; i++){
            for (int j =1 ;j<=n-i+1 ; j++ ){

                System.out.print(j+" ");
            }
            System.out.println();
        }
        
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        int n = sc.nextInt();
        IHPWN(n);
        sc.close();


    }
    
}
