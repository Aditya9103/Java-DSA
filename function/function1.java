package javaDSA.function;
import java.util.*;

public class function1 {

    public static void PrinthHelloworld(){
        System.out.println("Hello world");

    }


    public static void Calculate_Sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number");
        int a=sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b ;
        System.out.println(" Sum is: " + sum); 
        sc.close();
    }

    public static int Calculatesum( int a , int b){ //
        int sum = a + b;
        return  sum;
        
        
    }

    
   
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int num1= sc.nextInt();
        int num2 = sc.nextInt();
        
        
        int sum =Calculatesum(num1, num2);
        System.out.println("sum is :" +sum); 
        sc.close();
        

        

    }
    
}
