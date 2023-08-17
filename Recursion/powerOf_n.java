package javaDSA.Recursion;

public class powerOf_n {
    public static int power(int a, int n){
        if (n==0){
            return 1;
        }
        // int anm1=power(a,n-1);
        // int an=a*anm1;
        // return an;
        return a*power(a,n-1);
    }
    public static void main(String args[]){
        int n=5,a=3;
        System.out.println(power(n,a));
    }
    
}
