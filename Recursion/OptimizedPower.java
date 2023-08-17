package javaDSA.Recursion;

public class OptimizedPower {
    public static int Optimizedpower(int a, int n){
        if (n==0){
            return 1;
        }
        int halfpower=Optimizedpower(a, n/2);
        int halfpowersq=halfpower*halfpower;
        // int halfpowersq=Optimizedpower(a,n/2)*Optimizedpower(a,n/2);
        // n is odd
        if(n%2!=0){
            halfpowersq=a*halfpowersq;

        }
        return halfpowersq;
    }
    public static void main(String[] args) {
        int a=5,n=4;
        System.out.println(Optimizedpower(a,n));
        
    }
    
}
