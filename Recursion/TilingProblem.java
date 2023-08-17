package javaDSA.Recursion;

public class TilingProblem {
    public static int Tilingproblem(int n){
        if (n==0 ||n==1){
            return 1;
        }
        //verticle
        int fnm1=Tilingproblem(n-1);
        //horizontal
        int fnm2=Tilingproblem(n-2);

        int Total=fnm1+fnm2;
        return Total;

    }
    public static void main(String args[]){
        int n=10;
        System.out.println(Tilingproblem(n));


    }
    
}
