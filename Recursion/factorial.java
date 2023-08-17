package javaDSA.Recursion;

public class factorial {
    public static int Factorial(int n){
        if (n==1){
            return 1;
        }
        int fact=Factorial(n-1);
        fact=n*Factorial(n-1);
        return fact;
    }
    public static void main(String args[]){
        int n=5;
        System.out.println(Factorial(n));

    }
    
}
