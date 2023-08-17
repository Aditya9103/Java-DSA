package javaDSA.BitManipulation;

public class Check_Even_Odd {
    public static void check_even_odd(int n){
        int bitMask=1;
        if ((n & bitMask) == 0){
            System.out.println("Even number");
        }else{
            System.out.println("Odd numbers");
        }
    }
    public static void main (String args[]){
        check_even_odd(14);
    }
    
}
