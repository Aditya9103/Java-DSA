package javaDSA.Pattern;
import java.util.*;
public class Hollow_Rectangle {

    public static void Hollow_rectangle(int row, int col){
        for (int i= 1; i<= row; i++){
            for (int j =1; j<=col; j++){
                if ( i==1 || i== row || j==1 || j== col){
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
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter total number of rows and colomn:");

        int row = sc.nextInt();
        int col = sc.nextInt();
        Hollow_rectangle(row, col);
        sc.close();

    }

    
    
}
