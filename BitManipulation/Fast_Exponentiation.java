package javaDSA.BitManipulation;

public class Fast_Exponentiation {
    public static int Fast_exponentiation(int a, int n){
        int ans=1;
        while(n>0){
            if ((n&1)!=0){ //check LSB
                ans=ans*a;
            }
            a*=a;
            n>>=1;
        }
        return ans;
    }
    public static void main(String args[]){
        System.out.println(Fast_exponentiation(5,3));
    }
    
}
