package javaDSA.BitManipulation.Operation;

public class Clear_last_Ith_Bit {
    public static int clearlastithbit(int n ,int i){
        int bitMask=(~0)<<i;
        return n & bitMask;
    }
    public static void main (String arg[]){
        System.out.println(clearlastithbit(5,2));
    }
    
}
