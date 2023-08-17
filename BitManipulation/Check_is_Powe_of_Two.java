package javaDSA.BitManipulation;

public class Check_is_Powe_of_Two {
    public static boolean isPower_of_Two(int n){
        return (n&(n-1))==0;
    }
    public static void main (String args[]){
        System.out.println(isPower_of_Two(7));
    }
    
}
