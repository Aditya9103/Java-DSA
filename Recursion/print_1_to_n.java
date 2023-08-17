package javaDSA.Recursion;

public class print_1_to_n {
    public static void printIn(int n){
        if (n==1){
            System.out.println(n+" ");
            return;
        }
        printIn(n-1);
        System.out.println(n+" ");
    }
    public static void main(String args[]){
        int n=10;
        printIn(n);

    }
    
}
