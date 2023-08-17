package javaDSA.Recursion;

public class print_n_to_1 {
    public static void printD(int n){
        if (n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n +" ");
            
        printD(n-1);
        
    }
    public static void main(String[] args) {
        int n=10;
        printD(n);
        
    }
    
}
